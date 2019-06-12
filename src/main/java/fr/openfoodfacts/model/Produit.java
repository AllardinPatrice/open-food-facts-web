package fr.openfoodfacts.model;

/**
 * Classe Produit
 * 
 * @author Patrice
 *
 */

public class Produit {

	private long id;

	private String nom;

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

}
