package web;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metier.CommerceLocal;
import metier.enteties.Compte;


@WebServlet("/auth")
public class loginServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private CommerceLocal metier;
	
	private Compte compte;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String username = request.getParameter("username");
    	String code = request.getParameter("password");
    	compte = metier.getCompte(code);
		HttpSession session = request.getSession();
		session.setAttribute("role", "user");    	
    	if(compte!=null) {

    		session.setAttribute("user", compte);
    		//System.out.println("role : "+session.getAttribute("role") + "\n"+compte);
    		//Compte cp =(Compte) session.getAttribute("user");
    		//System.out.println("user is :"+cp.getUsername());
    		
    		
    		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
    		requestDispatcher.forward(request, response);
    	}
    	else {
    		request.setAttribute("user", null);
    		request.setAttribute("error", "Identifiant ou mot de passe incorrects");
    		RequestDispatcher requestDispatcher = request.getRequestDispatcher("connexion.jsp");
    		requestDispatcher.forward(request, response);
    	}
		
	}
	
	

}
