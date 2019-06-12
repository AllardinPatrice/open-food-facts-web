package fr.openfoodfacts.service;

import java.util.List;

import fr.openfoodfacts.dao.IngredientDao;
import fr.openfoodfacts.model.Ingredient;

/**
 * Classe de service d'ingrédient
 * 
 * @author Patrice
 *
 */

public class IngredientService {

	// Lecture de tous les ingrédients
	public void traitementAllIngredient(List<Ingredient> listeIngredient) {

		IngredientDao dao = new IngredientDao();
		listeIngredient = dao.recupererAll();
	}
}
