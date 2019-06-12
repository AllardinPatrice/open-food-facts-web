package fr.openfoodfacts.service;

import java.util.List;

import fr.openfoodfacts.dao.CategorieDao;
import fr.openfoodfacts.model.Categorie;

/**
 * Classe de serice de catégorie
 * 
 * @author Patrice
 *
 */

public class CategorieService {

	public void traitementAllCategorie(List<Categorie> listeCategorie) {

		CategorieDao dao = new CategorieDao();
		listeCategorie = dao.recupererAll();
	}
}
