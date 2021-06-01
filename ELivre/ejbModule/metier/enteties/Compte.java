package metier.enteties;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Long;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Compte
 *
 */
@Entity

public class Compte implements Serializable {	   
	@Id
	
	private String code;
	private String username;
	private String email;
	private Double solde=(double) 0;
	private Date dateCreation;
	private static final long serialVersionUID = 1L;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public Compte() {
		super();
	} 
	public Compte(String code, String username, String email, Double solde) {
		this.code = code;
		this.username = username;
		this.email = email;
		dateCreation = new Date();
		this.solde = solde;
	}
	public String getCode() {
		return this.code;
	}
	
	
	public void setCode(String code) {
		this.code = code;
	}   
	public Double getSolde() {
		return this.solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}   
	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
   
}
