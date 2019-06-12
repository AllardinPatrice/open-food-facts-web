package fr.openfoodfacts.service;

import java.util.List;

import fr.openfoodfacts.dao.ProduitDao;
import fr.openfoodfacts.model.Produit;

/**
 * Classe de serice de produit
 * 
 * @author Patrice
 *
 */

public class ProduitService {

	public void traitementAllProduit(List<Produit> listePoroduit) {

		ProduitDao dao = new ProduitDao();
		listePoroduit = dao.recupererAll();
	}
}
