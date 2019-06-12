package fr.openfoodfacts.model;

/**
 * Classe Marque
 * 
 * @author Patrice
 *
 */

public class Marque {

	private long id;

	private String nom;

	/**
	 * Constructeur de la classe marque
	 * 
	 * @param id
	 * @param nom
	 */
	public Marque(long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

}
