package com.ydlclass;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class A {
    private B b;
    public A() {
    }

    public A(B b) {
        this.b = b;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
    @PostConstruct
    public void init(){
        System.out.println("xml init");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy init");
    }
}
