
import java.util.List;

import javax.naming.*;

import metier.CommerceRemote;
import metier.enteties.Compte;
public class ClientRemote {

	public static void main(String[] args) {
		
		 try {
			Context ct = new InitialContext();
			String nomApp ="ELivreEAR";
			String nomModule = "ELivre";
			String nomBean = "BK";
			//String remoteInterface = CommerceRemote.class.getName();
			String remoteInterface = "metier.CommerceRemote";
			String nomComplet = "ejb:"+nomApp+"/"+nomModule+"/"+nomBean+"!"+remoteInterface;
			
			//String nomComplet = "ejb:/ELivre/BK!metier.CommerceRemote";
					
			CommerceRemote proxy = (CommerceRemote) ct.lookup(nomComplet);
			
			proxy.addCompte(new Compte());
			proxy.addCompte(new Compte());
			proxy.addCompte(new Compte());
			
			Compte cp = proxy.getCompte(1L);
			System.out.println(cp.getSolde());
			
			proxy.verser(1L, 4000);
			proxy.retirer(1L, 1000);
			proxy.virement(1L, 2L, 1000);
			List<Compte> cptes = proxy.listComptes();
			for (Compte c:cptes) {
				System.out.println(c.getCode()+":"+c.getSolde());
			}
			
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
