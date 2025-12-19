package com.example.demo;

import org.springframework.stereotype.Component;


// this annotation is what tells spring to create the object we want and manage it for us
@Component
public class Dev {
    public void build(){
        System.out.println("Working on some projects");
    }
}
