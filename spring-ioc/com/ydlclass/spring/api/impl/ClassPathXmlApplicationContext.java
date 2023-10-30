package com.ydlclass.spring.api.impl;

import com.ydlclass.spring.api.ApplicationContext;

import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
@SuppressWarnings("all")
public class ClassPathXmlApplicationContext implements ApplicationContext {


    private ConcurrentHashMap<String,Object> beans = new ConcurrentHashMap<>(64);
    private ConcurrentHashMap<String,Object> beanDefintion = new ConcurrentHashMap<>(64);

    public ClassPathXmlApplicationContext(String config) {
    }

    @Override
    public Object getBean(String name) {
        return null;
    }

    @Override
    public InputStream readXML(String config) {
        return null;
    }
}
