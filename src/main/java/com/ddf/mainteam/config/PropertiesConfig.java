package com.ddf.mainteam.config;

import com.ddf.mainteam.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by InnocentTIALO on 5/25/2020.
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertiesConfig {
    @Value("${ddf.username}")
    String username;

    @Value("${ddf.password}")
    String password;

    @Value("${ddf.url}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource() {
        return FakeDataSource.builder()
                .username(username)
                .password(password)
                .url(url).build();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
