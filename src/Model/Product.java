package Model;

import java.io.Serializable;

public class Product implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	
	private int id;
	private String nom;
	private String description;
	private int quantite;
	private int prix;
	private String image;

	public Product(String name, String description, Integer quantite, Integer price, String image) {
		super();
		this.nom = nom;
		this.description = description;
		this.quantite = quantite;
		this.prix = prix;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getPrix() {return prix;}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Product(int id, String nom, String description, int quantite, int prix, String image) {

		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.quantite = quantite;
		this.prix = prix;
		this.image = image;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", nom=" + nom + ", description=" + description + ", quantite=" + quantite
				+ ", prix=" + prix + ", image=" + image + "]";
	}
	
	
	
}
