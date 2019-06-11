package fr.diginamic.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Classe test de servlet avec 2 servlets (1er servlet)
 * 
 * @author Patrice
 *
 */
@WebServlet(urlPatterns = "/extraire/*")
public class ExtraireDonneesController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recupere la valeur d'un parametre dont le nom est idCategorie
		String idCategorie = req.getParameter("idCategorie");
		// code HTML ecrit dans le corps de la reponse

		// Récupérer la session existante ou création d'une session
		HttpSession session = req.getSession(true);

		// Stocker un utilisateur
		// session.setAttribute("auth", "auth patrice");
		req.setAttribute("auth", "auth patrice");

		// Redirection sur l'autre page
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/extraire2");
		dispatcher.forward(req, resp);

		resp.getWriter()
				.write("<h1>Categorie à extraire</h1>" + "<ul>" + "<li>identifiant=" + idCategorie + "</li>" + "</ul>");

	}
}
