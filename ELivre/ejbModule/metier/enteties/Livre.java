package metier.enteties;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Livre implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String designation;
	private double prix;
	private String description;
	private String img;
	private String etat;
	private String nomAuth;
	private String genre;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	Compte owner;
	
	@OneToOne(cascade = {CascadeType.ALL})
	Commande commandeOwner;
	
	public Livre() {
		super();
		
	}
	public Livre(String designation, double prix, String description, String img, String nomAuth, String genre) {
		
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.img = img;
		this.etat = "non vendu";
		this.genre = genre;
		this.nomAuth= nomAuth;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	public Compte getOwner() {
		return owner;
	}
	public void setOwner(Compte owner) {
		this.owner = owner;
	}
	public Commande getCommandeOwner() {
		return commandeOwner;
	}
	public void setCommandeOwner(Commande commandeOwner) {
		this.commandeOwner = commandeOwner;
	}
	public String getNomAuth() {
		return nomAuth;
	}
	public void setNomAuth(String nomAuth) {
		this.nomAuth = nomAuth;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	

	
}
