package qwe.asd.chucknorrisjokes.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import qwe.asd.chucknorrisjokes.repositories.FakeDataSource;
import qwe.asd.chucknorrisjokes.repositories.FakeJMSBroker;

@Configuration
@PropertySource({
        "classpath:datasource.properties",
        "classpath:jms.properties"
})
public class PropertyConfig {

    @Autowired
    private Environment env;

    //datasource.properties
    @Value("${guru.username}")
    private String user;

    @Value("${guru.password}")
    private String password;

    @Value("${guru.dburl}")
    private String url;
    //end

    //jms.properties
    @Value("${guru.jms.username}")
    private String jmsUser;

    @Value("${guru.jms.password}")
    private String jmsPassword;

    @Value("${guru.jms.url}")
    private String jmsUrl;
    //end


    @Bean
    public FakeDataSource getFakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(env.getProperty("USERNAME"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJMSBroker getFakeJMSBroker(){
        FakeJMSBroker fakeJMSBroker = new FakeJMSBroker();
        fakeJMSBroker.setJmsUsername(jmsUser);
        fakeJMSBroker.setJmsPassword(jmsPassword);
        fakeJMSBroker.setJmsUrl(jmsUrl);
        return fakeJMSBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
                new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
