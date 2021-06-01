package service;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.CommerceLocal;
import metier.enteties.Compte;

@WebService
public class CommerceService {
	@EJB
	private CommerceLocal metier;
	
	@WebMethod
	public Compte addCompte(@WebParam(name="compte")Compte cp) {
		return metier.addCompte(cp);
	}

	@WebMethod
	public Compte getCompte(@WebParam(name="code")String code) {
		return metier.getCompte(code);
	}

	@WebMethod
	public List<Compte> listComptes() {
		return metier.listComptes();
	}

	@WebMethod
	public void verser(@WebParam(name="code")String code,
			@WebParam(name="montant")double mt) {
		metier.verser(code, mt);
	}
	
	@WebMethod
	public void retirer(@WebParam(name="code")String code,
			@WebParam(name="montant")double mt) {
		metier.retirer(code, mt);
	}
	
	@WebMethod
	public void virement(
			@WebParam(name="code1")String code1,
			@WebParam(name="code2")String code2,
			@WebParam(name="montant")double mt) {
		metier.virement(code1, code2, mt);
	}
	
	
}
