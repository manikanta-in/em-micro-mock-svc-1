package eyemed.group.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.sql.DataSource;

@Configuration
//@PropertySource("classpath:application.properties")
@EnableCaching
@EnableAsync
public class AppConfig {

   // @Value("ENV{jboss.jndi.ui.name}")
   // private String uiJndiName;

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean(name = "dataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        return dataSourceBuilder.build();
    }

    @Bean
    public CommonsMultipartResolver commonsMultipartResolver() {
        final CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        commonsMultipartResolver.setMaxUploadSize(-1);
        return commonsMultipartResolver;
    }

    @Bean
    public String etServiceHost(@Value("ENV{et.wsdl.host}") String hostname) {
        return hostname;
    }

    @Bean
    public String etJbossServiceHost(@Value("ENV{jboss.wsdl.host}") String jbossHostname) {
        return jbossHostname;
    }

    @Bean
    public String apacheHost(@Value("ENV{apache.host}") String hostname) { return hostname; }

    @Bean
    public String legacyServiceHost(@Value("ENV{wsdl.host}") String hostname) {
        return hostname;
    }

    @Bean
    public String apacheEyeManageHost(@Value("ENV{apache.eyemanage.host}") String hostname) {
        return hostname;
    }

}
