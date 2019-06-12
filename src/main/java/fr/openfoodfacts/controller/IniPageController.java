package fr.openfoodfacts.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.openfoodfacts.dao.CategorieDao;
import fr.openfoodfacts.dao.ProduitDao;
import fr.openfoodfacts.model.Categorie;
import fr.openfoodfacts.model.Produit;

/**
 * Classe de servlet d'affichage des informations d'open food facts
 * 
 * @author Patrice
 *
 */
@WebServlet(urlPatterns = "/init/*")
public class IniPageController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CategorieDao categorieDao = new CategorieDao();
		List<Categorie> categories = categorieDao.recupererAll();
		ProduitDao produitDao = new ProduitDao();
		List<Produit> produits = produitDao.recupererAll();

		req.setAttribute("cat1", categories);
		req.setAttribute("pro1", produits);

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/recherche.jsp");
		requestDispatcher.forward(req, resp);
	}
}
