package com.ydlclass.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User implements Serializable {
    public static final Long SerialVersionUID = 1L;
    private Integer id;
    private String username;
    private String password;
}
