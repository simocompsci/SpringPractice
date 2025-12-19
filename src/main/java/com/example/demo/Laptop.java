package com.example.demo;

import org.springframework.stereotype.Component;

@Component
// @Primary // we use this annotation when we have two classes who 
// implements the same interface and we are calling the interface.
// this basicaly makes this class the primary choice for the spring container
public class Laptop {

    public void compile(){
        System.out.println("compiling with some bugs");
    }

    public void debug(){
        System.out.println("debugging my code");
    }
    
}
