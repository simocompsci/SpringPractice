package com.example.demo;

public class Dev2 {
    // this is a second class to test the lose coupling concept with my other classes
    private Computer c;

    Dev2(Computer c){
        this.c = c;
    }

    Dev2(){
    }

    public void setC(Computer c){
        this.c = c;
    }

    void execute(){
        c.markName();
    }

}
