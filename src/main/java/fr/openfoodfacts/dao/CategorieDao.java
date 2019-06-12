package fr.openfoodfacts.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.openfoodfacts.exception.TechnicalException;
import fr.openfoodfacts.model.Categorie;
import fr.openfoodfacts.utils.ConnectionUtils;

/**
 * Classe DAO de catégorie
 * 
 * @author Patrice
 *
 */

public class CategorieDao {

	/** SERVICE_LOG : Logger */
	private static final Logger SERVICE_LOG = LoggerFactory.getLogger(CategorieDao.class);

	public List<Categorie> recupererAll() {

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<Categorie> listeCategorie = new ArrayList<>();

		try {
			preparedStatement = ConnectionUtils.getInstance().prepareStatement("select * from categorie");
			resultSet = preparedStatement.executeQuery();
			ConnectionUtils.doCommit();
			while (resultSet.next()) {
				Integer id = resultSet.getInt("CTG_ID");
				String nom = resultSet.getString("CTG_NOM");
				listeCategorie.add(new Categorie(id, nom));
			}
			return listeCategorie;
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
