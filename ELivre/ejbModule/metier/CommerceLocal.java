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
	
}
