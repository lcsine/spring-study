package com.ydlclass;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class ResourceTest {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("/jdbc.properties");
        resource = new FileSystemResource("D:/xx/xxx");
        try {
            System.out.println(resource.contentLength());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
