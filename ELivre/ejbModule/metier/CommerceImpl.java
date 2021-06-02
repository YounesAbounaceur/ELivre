package metier;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.enteties.Commande;
import metier.enteties.Compte;
import metier.enteties.Livre;
@Stateless(name = "BK")
public class CommerceImpl implements CommerceLocal, CommerceRemote {
	@PersistenceContext(unitName = "ELivre")
	private EntityManager em;
	
	
	@Override
	public Compte addCompte(Compte cp) {
		em.persist(cp);
		return cp;
		
		
	}

	@Override
	public Compte getCompte(String code) {
		Compte cp = em.find(Compte.class, code);
		if(cp==null) throw new RuntimeException("Compte introuvable");
		return cp;
	}

	@Override
	public List<Compte> listComptes() {
		Query req = em.createQuery("select c from Compte c");
		return req.getResultList();
	}

	@Override
	public void verser(String code, double mt) {
		Compte cp = getCompte(code);
		cp.setSolde(cp.getSolde()+mt);
		
	}

	@Override
	public void retirer(String code, double mt) {
		Compte cp = getCompte(code);
		if(cp.getSolde()<mt) throw new RuntimeException("Solde insuffisant");
		
		cp.setSolde(cp.getSolde()-mt);
		
	}

	@Override
	public void virement(String cp1, String cp2, double mt) {
		retirer(cp1,mt);
		verser(cp2,mt);
		
	}
	@Override
	public Livre addLivre(Livre livre) {
		em.persist(livre);
		return livre;
		
		
	}
	@Override
	public void ajouterLivre(String idCompte, Livre livre) {
		
		Compte compte = em.find(Compte.class, idCompte);
		
		List<Livre> livres = new ArrayList<Livre>();
		livres = compte.getLivres();
		
			
		livres.add(livre);
		compte.setLivres(livres);
		em.merge(compte);
		
		
	}
	@Override
	public void ajouterCommande(String idCompte, Commande commande) {
		Compte compte = em.find(Compte.class, idCompte);
		compte.getCommandes().add(commande);
	}
	@Override
	public void effectuerCommande(String idCpt1, Livre livre) {
		Compte cpt1 = em.find(Compte.class, idCpt1);
		Compte cpt2 = livre.getOwner();
		Commande commande =livre.getCommandeOwner();
		ajouterCommande(idCpt1,commande);
		livre.setEtat("vendu");
		double prix = livre.getPrix();
		virement(idCpt1, idCpt1, prix);
	}
	
	@Override
	public void supprLivre(String idCpt, Livre livre){
		Compte compte = em.find(Compte.class, idCpt);
		compte.getLivres().remove(livre);
	}


}
