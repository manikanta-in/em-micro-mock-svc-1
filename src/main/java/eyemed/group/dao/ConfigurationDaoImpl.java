package eyemed.group.dao;

import eyemed.group.controllers.api.exceptions.DaoException;
import eyemed.group.util.DBUtils;
import oracle.jdbc.OracleTypes;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import javax.sql.DataSource;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;

/**
 * @author: Vijayakumar Ramaswamy
 * @since: 11/8/2018
 */

@Repository
public class ConfigurationDaoImpl implements ConfigurationDao {
    private static final Log LOGGER = LogFactory.getLog(ConfigurationDaoImpl.class);
    private static final String GET_GRP_MISC_DETAILS_STORED_FUNCTION = "LUXSF_GRP_GET_MISC_DETAILS (?,?,?,?,?)";

    private JdbcTemplate jdbcTemplate;

    public ConfigurationDaoImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Cacheable("groupMiscData")
    public HashMap<String,String> getMiscDetails(String configuration, String inputKey) throws DaoException {
        HashMap<String,String> configResult = new HashMap<>();
        Connection connection = null;
        CallableStatement function = null;
        ResultSet configResultSet = null;
        try {
            if (jdbcTemplate.getDataSource() != null) {
                connection = jdbcTemplate.getDataSource().getConnection();
                function = connection.prepareCall("begin ? := " + GET_GRP_MISC_DETAILS_STORED_FUNCTION + "; end;");
                function.registerOutParameter(1, OracleTypes.NUMBER);
                function.registerOutParameter(2, OracleTypes.CURSOR);
                function.registerOutParameter(3, OracleTypes.NUMBER);
                function.registerOutParameter(4, OracleTypes.VARCHAR);
                function.setString(5, StringUtils.isEmpty(configuration) ? null : configuration.toUpperCase().trim());
                function.setString(6, StringUtils.isEmpty(inputKey) ? null : inputKey.toUpperCase().trim());

                if (LOGGER.isTraceEnabled()) {
                    LOGGER.trace("Executing stored function: " + GET_GRP_MISC_DETAILS_STORED_FUNCTION
                            + "  with configuration : " + configuration
                            + ", inputKey : " + inputKey
                    );
                }

                configResultSet = DBUtils.executeSFForResultSet(function);
                if (configResultSet != null) {
                    while (configResultSet.next()) {
                        String misc_key = DBUtils.getValueFromResultSet(configResultSet, "MISC_KEY", "");
                        String misc_val = DBUtils.getValueFromResultSet(configResultSet, "MISC_VALUE", "");
                        if(misc_val!=null && (misc_val.equalsIgnoreCase("Y") || misc_val.equalsIgnoreCase("N"))){
                            misc_val = DBUtils.toBoolean(misc_val,"Y").toString();
                        }
                        configResult.put(misc_key,misc_val);
                    }
                }
            }
        } catch (Exception e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("Error getUserProfile.", e);
            }
            throw new DaoException(e.getMessage(), e.getCause());
        } finally {
            DBUtils.close(configResultSet, function, connection);
        }
        return configResult;
    }

}
