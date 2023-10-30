package com.ydlclass;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component

@ComponentScan("com.ydlclass.dao")
public class AppConfig {
    @Bean
    @Qualifier
    public User s(){
    return new User();
    }
}
