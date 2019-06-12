package fr.openfoodfacts.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.openfoodfacts.dao.ProduitDao;
import fr.openfoodfacts.model.Produit;

/**
 * Classe de servlet d'affichage des produits d'open food facts
 * 
 * @author Patrice
 *
 */
@WebServlet(urlPatterns = "/rechercher/*")
public class RechercherServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String selectedCateg = req.getParameter("selectedCateg");
		Integer idCategorie = Integer.parseInt(selectedCateg);

		String selectedMarque = req.getParameter("selectedMarque");
		Integer idMarque = Integer.parseInt(selectedMarque);

		ProduitDao produitDao = new ProduitDao();
		List<Produit> produits = produitDao.recupererParCategorieEtMarque(idCategorie, idMarque);

		req.setAttribute("produits", produits);

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/afficherProduits.jsp");
		requestDispatcher.forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}
}
