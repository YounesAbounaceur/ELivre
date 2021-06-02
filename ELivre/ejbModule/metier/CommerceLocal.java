package metier;
import java.util.List;
import javax.ejb.Local;
import metier.enteties.*;
@Local
public interface CommerceLocal {
	public Compte addCompte(Compte cp);
	public Compte getCompte(String compte);
	public List <Compte> listComptes();
	public void verser(String code, double mt);
	public void retirer(String code, double mt);
	public void virement(String cp1,String cp2, double mt);
	
	public Livre addLivre(Livre livre);
	public void ajouterLivre(String idCompte, Livre livre);
	public void ajouterCommande(String idCompte, Commande commande);
	public void effectuerCommande(String idCpt1, Livre livre);
	public void supprLivre(String idCpt, Livre livre);
	
}
