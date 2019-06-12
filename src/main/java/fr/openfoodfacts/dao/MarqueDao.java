package fr.openfoodfacts.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.openfoodfacts.exception.TechnicalException;
import fr.openfoodfacts.model.Marque;
import fr.openfoodfacts.utils.ConnectionUtils;

/**
 * Classe DAO de marque
 * 
 * @author Patrice
 *
 */

public class MarqueDao {

	/** SERVICE_LOG : Logger */
	private static final Logger SERVICE_LOG = LoggerFactory.getLogger(MarqueDao.class);

	public List<Marque> recupererAll() {

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<Marque> listeMarque = new ArrayList<>();

		try {
			preparedStatement = ConnectionUtils.getInstance().prepareStatement("select * from marque");
			resultSet = preparedStatement.executeQuery();
			ConnectionUtils.doCommit();
			while (resultSet.next()) {
				Integer id = resultSet.getInt("MRQ_ID");
				String nom = resultSet.getString("MRQ_NOM");
				listeMarque.add(new Marque(id, nom));
			}
			return listeMarque;
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

	public List<Marque> recupererParCategorie(Integer idCategorie) {

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<Marque> listeMarque = new ArrayList<>();

		try {
			preparedStatement = ConnectionUtils.getInstance().prepareStatement(
					"SELECT distinct(MRQ.MRQ_ID), MRQ.MRQ_NOM FROM PRODUIT PRD, MARQUE MRQ WHERE PDT_MARQUE = MRQ.MRQ_ID AND PDT_CATEGORIE = ?");
			preparedStatement.setInt(1, idCategorie);
			resultSet = preparedStatement.executeQuery();
			ConnectionUtils.doCommit();
			while (resultSet.next()) {
				Integer id = resultSet.getInt("MRQ_ID");
				String nom = resultSet.getString("MRQ_NOM");
				listeMarque.add(new Marque(id, nom));
			}
			return listeMarque;
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
