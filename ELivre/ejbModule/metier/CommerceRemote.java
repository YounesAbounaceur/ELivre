package metier;
import java.util.List;
import javax.ejb.Remote;
import metier.enteties.*;
@Remote
public interface CommerceRemote {
	public Compte addCompte(Compte cp);
	public Compte getCompte(String code);
	public List <Compte> listComptes();
	public void verser(String code, double mt);
	public void retirer(String code, double mt);
	public void virement(String cp1,String cp2, double mt);
	
   
}
