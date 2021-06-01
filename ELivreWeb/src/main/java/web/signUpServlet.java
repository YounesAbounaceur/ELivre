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


@WebServlet("/signup")
public class signUpServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private CommerceLocal metier;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Compte compte;
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		Double solde = Double.parseDouble(request.getParameter("solde"));
		String password = request.getParameter("password");
		String password2 = request.getParameter("password2");
		if(password.equals(password2)) {
			compte = new Compte(password, username, email, solde);
			metier.addCompte(compte);
    		RequestDispatcher requestDispatcher = request.getRequestDispatcher("connexion.jsp");
    		requestDispatcher.forward(request, response);			
		}
		else {
    		request.setAttribute("error", "le mot de passe confirmé n'est pas correct, veuillez reconfirmer le mot de passe");
    		request.getRequestDispatcher("signup.jsp").forward(request, response);
		}
	}

}
