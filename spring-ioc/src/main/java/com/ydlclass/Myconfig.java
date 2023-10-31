package com.ydlclass;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration

@PropertySource("classpath:jdbc.properties")
public class Myconfig {
    @Value("${jdbc.url}")
    private String url;

    @Override
    public String toString() {
        return "Myconfig{" +
                "url='" + url + '\'' +
                '}';
    }
}
