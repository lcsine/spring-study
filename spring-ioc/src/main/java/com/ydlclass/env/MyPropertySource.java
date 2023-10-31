package com.ydlclass.env;

import org.springframework.core.env.PropertySource;

import java.util.Properties;

public class MyPropertySource extends PropertySource {
    private Properties properties = new Properties();

    public MyPropertySource(String name) {
        super(name);
        properties.put(name,"properties");
    }

    @Override
    public Object getProperty(String name) {
        return properties.get(name);
    }
}
