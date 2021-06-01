package metier;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.enteties.Compte;
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



}
