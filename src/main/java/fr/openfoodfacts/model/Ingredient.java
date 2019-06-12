package fr.openfoodfacts.model;

/**
 * Classe Ingredient
 * 
 * @author Patrice
 *
 */

public class Ingredient {

	/** Id d'ingrédient */
	private long id;
	/** Nom d'ingrédient */
	private String nom;

	/**
	 * Constructeur
	 * 
	 * @param id
	 *            d'ingrédient
	 * @param nom
	 *            d'ingrédient
	 */
	public Ingredient(long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the id d'ingrédient
	 */
	public long getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id
	 *            d'ingrédient (set)
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the nom d'ingrédient
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            d'ingrédient (set)
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

}
