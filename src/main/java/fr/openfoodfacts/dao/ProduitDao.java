package fr.openfoodfacts.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.openfoodfacts.exception.TechnicalException;
import fr.openfoodfacts.model.Produit;
import fr.openfoodfacts.utils.ConnectionUtils;

/**
 * Classe DAO de produit
 * 
 * @author Patrice
 *
 */

public class ProduitDao {

	/** SERVICE_LOG : Logger */
	private static final Logger SERVICE_LOG = LoggerFactory.getLogger(CategorieDao.class);

	public List<Produit> recupererAll() {

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<Produit> listeProduit = new ArrayList<>();

		try {
			preparedStatement = ConnectionUtils.getInstance().prepareStatement("select * from produit");
			resultSet = preparedStatement.executeQuery();
			ConnectionUtils.doCommit();
			while (resultSet.next()) {
				Integer id = resultSet.getInt("PDT_ID");
				String nom = resultSet.getString("PDT_NOM");
				listeProduit.add(new Produit(id, nom));
			}
			return listeProduit;
		} catch (SQLException e) {
			SERVICE_LOG.error("probleme de selection en base", e);
			throw new TechnicalException("probleme de selection en base", e);

		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					SERVICE_LOG.error("impossible de fermer le resultSet", e);
					throw new TechnicalException("impossible de fermer le resultSet", e);
				}
			}
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					SERVICE_LOG.error("impossible de fermer le statement", e);
					throw new TechnicalException("impossible de fermer le statement", e);
				}
			}
			ConnectionUtils.doClose();
		}

	}

	public List<Produit> recupererParCategorieEtMarque(Integer idCategorie, Integer idMarque) {

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<Produit> listeProduit = new ArrayList<>();

		try {
			preparedStatement = ConnectionUtils.getInstance().prepareStatement(
					"SELECT PDT_ID, PDT_NOM, CTG_NOM, MRQ_NOM, PDT_NUTRITIONGRADE, PDT_ENERGIE, PDT_GRAISSE FROM openfoodfactbdd.produit INNER JOIN categorie ON CTG_ID = PDT_CATEGORIE INNER JOIN marque on PDT_MARQUE = MRQ_ID where pdt_categorie=? AND pdt_marque=?");
			preparedStatement.setInt(1, idCategorie);
			preparedStatement.setInt(2, idMarque);
			resultSet = preparedStatement.executeQuery();
			ConnectionUtils.doCommit();
			while (resultSet.next()) {
				Integer id = resultSet.getInt("PDT_ID");
				String nom = resultSet.getString("PDT_NOM");
				String categorie = resultSet.getString("CTG_NOM");
				String marque = resultSet.getString("MRQ_NOM");
				String nutritionGrade = resultSet.getString("PDT_NUTRITIONGRADE");
				Double energie = resultSet.getDouble("PDT_ENERGIE");
				Double graisse = resultSet.getDouble("PDT_GRAISSE");

				listeProduit.add(new Produit(id, nom, categorie, marque, nutritionGrade, energie, graisse));
			}
			return listeProduit;
		} catch (SQLException e) {
			SERVICE_LOG.error("probleme de selection en base", e);
			throw new TechnicalException("probleme de selection en base", e);

		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					SERVICE_LOG.error("impossible de fermer le resultSet", e);
					throw new TechnicalException("impossible de fermer le resultSet", e);
				}
			}
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					SERVICE_LOG.error("impossible de fermer le statement", e);
					throw new TechnicalException("impossible de fermer le statement", e);
				}
			}
			ConnectionUtils.doClose();
		}

	}

	public List<Produit> recupererParID(Integer idProduit) {

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<Produit> listeProduit = new ArrayList<>();

		try {
			preparedStatement = ConnectionUtils.getInstance().prepareStatement(
					"SELECT PDT_ID, PDT_NOM, CTG_NOM, MRQ_NOM, PDT_NUTRITIONGRADE, PDT_ENERGIE, PDT_GRAISSE FROM openfoodfactbdd.produit INNER JOIN categorie ON CTG_ID = PDT_CATEGORIE INNER JOIN marque on PDT_MARQUE = MRQ_ID where pdt_id=?");
			preparedStatement.setInt(1, idProduit);
			resultSet = preparedStatement.executeQuery();
			ConnectionUtils.doCommit();
			while (resultSet.next()) {
				Integer id = resultSet.getInt("PDT_ID");
				String nom = resultSet.getString("PDT_NOM");
				String categorie = resultSet.getString("CTG_NOM");
				String marque = resultSet.getString("MRQ_NOM");
				String nutritionGrade = resultSet.getString("PDT_NUTRITIONGRADE");
				Double energie = resultSet.getDouble("PDT_ENERGIE");
				Double graisse = resultSet.getDouble("PDT_GRAISSE");

				listeProduit.add(new Produit(id, nom, categorie, marque, nutritionGrade, energie, graisse));
			}
			return listeProduit;
		} catch (SQLException e) {
			SERVICE_LOG.error("probleme de selection en base", e);
			throw new TechnicalException("probleme de selection en base", e);

		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					SERVICE_LOG.error("impossible de fermer le resultSet", e);
					throw new TechnicalException("impossible de fermer le resultSet", e);
				}
			}
			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					SERVICE_LOG.error("impossible de fermer le statement", e);
					throw new TechnicalException("impossible de fermer le statement", e);
				}
			}
			ConnectionUtils.doClose();
		}

	}

}
