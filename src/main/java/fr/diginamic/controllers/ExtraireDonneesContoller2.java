package fr.diginamic.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/extraire2/*")
public class ExtraireDonneesContoller2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recupere la valeur d'un parametre dont le nom est idCategorie
		// String idCategorie = req.getParameter("idCategorie");
		// code HTML ecrit dans le corps de la reponse

		// Récupérer la session existante ou création d'une session
		// HttpSession session = req.getSession(true);

		// Récupérer une valeur stockée
		// Object utilisateur = session.getAttribute("auth");
		Object utilisateur = req.getAttribute("auth");

		// resp.getWriter()
		// .write("<h1>Categorie à extraire</h1>" + "<ul>" + "<li>identifiant="
		// + idCategorie + "</li>" + "</ul>");

		resp.getWriter().write(utilisateur.toString());
	}
}
