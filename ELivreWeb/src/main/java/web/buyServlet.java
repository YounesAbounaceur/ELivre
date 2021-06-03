package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * Servlet implementation class buyServlet
 */
@WebServlet("/buyServlet")
public class buyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private CommerceLocal metier;
    public buyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		HttpSession session = request.getSession();
		
		Compte cp =(Compte) session.getAttribute("user");
		//String idCompte = cp.getCode();
		
		//List<Livre> livresAffich = new ArrayList<Livre>();
		
		//List<Compte> comptes = metier.listComptes();
		List<Livre> livres = new ArrayList<Livre>();
		List<Livre> ls = metier.listLivres();
		if(ls != null) {
			for(Livre l:ls) {
				//System.out.println("livre "+l.getDesignation());
				if(l.getEtat().equals("non vendu") && !cp.getCode().equals(l.getOwner().getCode())){
					System.out.println("owner "+l.getOwner());
					livres.add(l);
			}
			}
		}
		
		
		
	
		request.setAttribute("livres", livres);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Achat.jsp");
		requestDispatcher.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Compte cp =(Compte) session.getAttribute("user");
		int idLivre =  Integer.parseInt(request.getParameter("buyLivre"));
		metier.effectuerCommande(cp.getCode(), idLivre);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
		requestDispatcher.forward(request, response);
	
	}

}
