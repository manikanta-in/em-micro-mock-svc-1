package eyemed.group.service;

import java.util.HashMap;

/*
 * @author Vijayakumar Ramaswamy
 * @since 11/8/2018
 */

public interface ConfigurationService {
    HashMap<String,String> getConfigurationDetails(String category, String key) throws Exception;
    HashMap<String,String> getCyberSourceConfiguration(String category, String key, boolean isAllConfiguredNeed) throws Exception;
}
