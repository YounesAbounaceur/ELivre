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
	
	@EJB
	private CommerceLocal metier;
	
	private Compte compte;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String username = request.getParameter("username");
    	String code = request.getParameter("password");
    	compte = metier.getCompte(code);
    	
    	if(compte!=null) {
    		HttpSession session = request.getSession();
    		session.setAttribute("role", "user");
    		session.setAttribute("user", compte);
    		System.out.println("role : "+session.getAttribute("role") + "\n"+compte);
    		
    		RequestDispatcher requestDispatcher = request.getRequestDispatcher("controler");
    		requestDispatcher.forward(request, response);
    	}
    	else {
    		request.setAttribute("error", "Identifiant ou mot de passe incorrects");
    		request.getRequestDispatcher("connexion.jsp").forward(request, response);
    	}
		
	}
	
	

}
