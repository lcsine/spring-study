package com.ydlclass;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
@Data



public class User {
    private String name;
    private String add;
    private int age;
    private String[] hobby;
    private Address address;
    private List<String> friend;
    private Map<String,String> parents;
    @Autowired
    public User(String name, String add, int age, String[] hobby, Address address, List<String> friend, Map<String, String> parents) {
        this.name = name;
        this.add = add;
        this.age = age;
        this.hobby = hobby;
        this.address = address;
        this.friend = friend;
        this.parents = parents;
    }


    public User() {
    }
}
