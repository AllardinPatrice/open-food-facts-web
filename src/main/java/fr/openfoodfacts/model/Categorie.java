package fr.openfoodfacts.model;

/**
 * Classe Catégorie
 * 
 * @author Patrice
 *
 */

public class Categorie {

	/** Id de categorie */
	private long id;
	/** Nom de categorie */
	private String nom;

	/**
	 * Constructeur
	 * 
	 * @param id
	 *            de catégorie
	 * @param nom
	 *            de catégorie
	 */
	public Categorie(long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the id de catégorie
	 */
	public long getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id
	 *            de catégorie (set)
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the nom de catégorie
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            de catégorie (set)
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

}
