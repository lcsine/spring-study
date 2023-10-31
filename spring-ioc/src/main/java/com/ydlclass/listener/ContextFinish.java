package com.ydlclass.listener;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ContextFinish {
    static {
        System.out.println("init");
    }

    public static void s(){
        System.out.println("Static");

    }
    @EventListener
    public void load(ContextRefreshedEvent event){
        s();
    }
}
