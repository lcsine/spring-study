package com.ydlclass;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address implements DisposableBean, InitializingBean {
    private String name;
    public void setName(String name){
        System.out.println("set!");
        this.name = name;
    }
    public Address() {
        System.out.println("Address init!");
    }

    @Override
    public void destroy()  {
        System.out.println("destroy");
    }

    @Override
    public void afterPropertiesSet(){
        System.out.println("afterPropertiesSet");
    }
}
