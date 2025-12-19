package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


// this annotation is what tells spring to create the object we want and manage it for us
@Component
public class Dev {

    // this is filed injection
    @Autowired
    private Laptop laptop;

    // this is constructor injection
    // public Dev(Laptop laptop){
    //     this.laptop = laptop;
    // }

    // this is the setter injection
    // @Autowired
    // public void setLaptop(Laptop laptop){
    //     this.laptop = laptop;
    // }

    public void build(){

        laptop.compile();
        laptop.debug();
        System.out.println("Working on some projects");
    }
}
