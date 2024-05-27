package com.springframework.sfgdi.config;

import com.springframework.sfgdi.datasource.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:datasource.properties")
@Configuration
public class DataSourceConfig {

    @Bean
    FakeDataSource fakeDataSource(@Value("${di.username}") String username,
                                  @Value("${di.password}") String password,
                                  @Value("${di.jdbcurl}") String jdbcurl) {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcUrl(jdbcurl);
        return fakeDataSource;
    }
}
