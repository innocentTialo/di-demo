package com.ddf.mainteam.config;

import com.ddf.mainteam.examplebeans.FakeDataSource;
import com.ddf.mainteam.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by InnocentTIALO on 5/25/2020.
 */
@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})// we can also use propertySources like this:
@PropertySources({
       /* @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")*/
        @PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
})
public class PropertiesConfig {
    @Value("${ddf.username}")
    String username;

    @Value("${ddf.password}")
    String password;

    @Value("${ddf.url}")
    String url;

    @Value("${ddf.jms.username}")
    String jmsUsername;

    @Value("${ddf.jms.password}")
    String jmsPassword;

    @Value("${ddf.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        return FakeDataSource.builder()
                .username(username)
                .password(password)
                .url(url).build();
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        return FakeJmsBroker.builder()
                .username(jmsUsername)
                .password(jmsPassword)
                .url(jmsUrl).build();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
