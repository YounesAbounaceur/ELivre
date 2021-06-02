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
import metier.enteties.Livre;

/**
 * Servlet implementation class sellServlet
 */
@WebServlet("/Sell")
public class sellServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private CommerceLocal metier;
    public sellServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Compte cp =(Compte) session.getAttribute("user");
		String idCompte = cp.getCode();
		
		String description = request.getParameter("description");
		String designation = request.getParameter("designation");
		String genre = request.getParameter("genre");
		String img = request.getParameter("img");
		String auteur = request.getParameter("auteur");
		Double prix = Double.parseDouble(request.getParameter("prix"));
		
		Livre livre = new Livre(designation, prix, description, img, auteur, genre);
		System.out.println("livre "+livre.getId()+" "+livre.getDesignation());
		
		metier.addLivre(livre);
		metier.ajouterLivre(idCompte, livre);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Vendre.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
