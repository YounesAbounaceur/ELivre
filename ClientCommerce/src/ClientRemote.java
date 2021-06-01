
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
			//String username, String email, Double solde
			/*
			proxy.addCompte(new Compte("187d","younesAB","younes.ab@gmail.com",8792D));
			proxy.addCompte(new Compte("1","Zizo","zizi@gmail.com",81335D));
			proxy.addCompte(new Compte("3xc","Yone","Yone@hotmail.fr",792D));
			*/
			Compte cp = proxy.getCompte(new String("1"));
			System.out.println(cp.getSolde());
			List<Compte> comptes = proxy.listComptes();
			for (Compte c:comptes) {
				System.out.println(c.getCode()+":"+c.getSolde());
			}
			
			/*
			proxy.verser(1L, 4000);
			proxy.retirer(1L, 1000);
			proxy.virement(1L, 2L, 1000);
			List<Compte> cptes = proxy.listComptes();
			for (Compte c:cptes) {
				System.out.println(c.getCode()+":"+c.getSolde());
			}
			
			*/
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
