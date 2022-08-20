package eyemed.group.dao;

import eyemed.group.controllers.api.exceptions.DaoException;

import java.util.HashMap;

/**
 * @author: Vijayakumar Ramaswamy
 * @since: 11/8/2018
 */

public interface ConfigurationDao {
    HashMap<String,String> getMiscDetails(String category, String key) throws DaoException;
}
