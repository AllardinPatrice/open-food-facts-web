package fr.openfoodfacts.model;

/**
 * Classe Produit
 * 
 * @author Patrice
 *
 */

public class Produit {

	/** id de produit */
	private long id;
	/** nom de produit */
	private String nom;
	/** marque de produit */
	private String marque;
	/** categorie de produit */
	private String categorie;
	/** grade nutritionnel de produit */
	private String gradeNutritionnnel;

	/**
	 * Constructeur
	 * 
	 * @param id
	 *            de produit
	 * @param nom
	 *            de produit
	 * @param marque
	 *            de produit
	 * @param categorie
	 *            de produit
	 * @param gradeNutritionnnel
	 *            de produit
	 * @param energie
	 *            de produit
	 * @param graisse
	 *            de produit
	 */
	public Produit(long id, String nom, String categorie, String marque, String gradeNutritionnnel, Double energie,
			Double graisse) {
		super();
		this.id = id;
		this.nom = nom;
		this.marque = marque;
		this.categorie = categorie;
		this.gradeNutritionnnel = gradeNutritionnnel;
		this.energie = energie;
		this.graisse = graisse;
	}

	private Double energie;

	private Double graisse;

	/**
	 * Constructeur
	 * 
	 * @param id
	 *            de produit
	 * @param nom
	 *            de produit
	 */
	public Produit(long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the id de produit
	 */
	public long getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id
	 *            de produit (set)
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the nom de produit
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            de produit (set)
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * Setter
	 * 
	 * @param marque
	 *            the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * Getter
	 * 
	 * @return the categorie
	 */
	public String getCategorie() {
		return categorie;
	}

	/**
	 * Setter
	 * 
	 * @param categorie
	 *            the categorie to set
	 */
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	/**
	 * Getter
	 * 
	 * @return the gradeNutritionnnel
	 */
	public String getGradeNutritionnnel() {
		return gradeNutritionnnel;
	}

	/**
	 * Setter
	 * 
	 * @param gradeNutritionnnel
	 *            the gradeNutritionnnel to set
	 */
	public void setGradeNutritionnnel(String gradeNutritionnnel) {
		this.gradeNutritionnnel = gradeNutritionnnel;
	}

	/**
	 * Getter
	 * 
	 * @return the energie
	 */
	public Double getEnergie() {
		return energie;
	}

	/**
	 * Setter
	 * 
	 * @param energie
	 *            the energie to set
	 */
	public void setEnergie(Double energie) {
		this.energie = energie;
	}

	/**
	 * Getter
	 * 
	 * @return the graisse
	 */
	public Double getGraisse() {
		return graisse;
	}

	/**
	 * Setter
	 * 
	 * @param graisse
	 *            the graisse to set
	 */
	public void setGraisse(Double graisse) {
		this.graisse = graisse;
	}

}
