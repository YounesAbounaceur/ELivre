package metier.enteties;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.xml.crypto.Data;


@Entity
public class Commande implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCmd;
	
	private Date cmddate;
	private String cmdetat;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	Compte commandeur;
	
	@OneToOne(mappedBy="commandeOwner",cascade = {CascadeType.ALL})
	Livre livre;
   
   
	public Commande() {
		super();
	}
	public Commande(String cmdetat, Compte commandeur, Livre livre) {
		this.cmdetat = cmdetat;
		this.livre = livre;
		this.commandeur = commandeur;
		this.cmddate = new Date();
		
	}
	public int getIdCmd() {
		return idCmd;
	}
	public void setIdCmd(int idCmd) {
		this.idCmd = idCmd;
	}
	public Date getCmddate() {
		return cmddate;
	}
	public void setCmddate(Date cmddate) {
		this.cmddate = cmddate;
	}
	public String getCmdetat() {
		return cmdetat;
	}
	public void setCmdetat(String cmdetat) {
		this.cmdetat = cmdetat;
	}
	public Compte getCommandeur() {
		return commandeur;
	}
	public void setCommandeur(Compte commandeur) {
		this.commandeur = commandeur;
	}
	public Livre getLivre() {
		return livre;
	}
	public void setLivre(Livre livre) {
		this.livre = livre;
	}
	
	
	
	

}
