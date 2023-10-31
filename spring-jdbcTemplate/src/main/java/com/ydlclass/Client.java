package com.ydlclass;

import com.ydlclass.entity.User;
import com.ydlclass.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ydlclass");
        IUserService bean = context.getBean(IUserService.class);
        List<User> user = bean.selectByAll();
        System.out.println(user);

    }
}
