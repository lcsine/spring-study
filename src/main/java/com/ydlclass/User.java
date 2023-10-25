package com.ydlclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
@Data
@NoArgsConstructor

@AllArgsConstructor
public class User {
    private String name;
    private String add;
    private int age;
    private String[] hobby;
    private Address address;
    private List<String> friend;
    private Map<String,String> parents;

}
