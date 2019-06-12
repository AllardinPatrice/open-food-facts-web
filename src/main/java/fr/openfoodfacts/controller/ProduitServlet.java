package fr.openfoodfacts.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.openfoodfacts.dao.IngredientDao;
import fr.openfoodfacts.dao.ProduitDao;
import fr.openfoodfacts.model.Ingredient;
import fr.openfoodfacts.model.Produit;

/**
 * Classe de servlet d'affichage des produits d'open food facts
 * 
 * @author Patrice
 *
 */
@WebServlet(urlPatterns = "/produit/*")
public class ProduitServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String selectedProd = req.getParameter("idProduit");
		Integer idProduit = Integer.parseInt(selectedProd);

		ProduitDao produitDao = new ProduitDao();
		List<Produit> produits = produitDao.recupererParID(idProduit);

		req.setAttribute("produits", produits);

		IngredientDao ingredientDao = new IngredientDao();
		List<Ingredient> ingredients = ingredientDao.recupererParIdProduit(idProduit);

		req.setAttribute("ingredients", ingredients);

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/detailProduits.jsp");
		requestDispatcher.forward(req, resp);
	}
}
