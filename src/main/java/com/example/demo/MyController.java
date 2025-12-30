package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;



@Controller
public class MyController {
    @RequestMapping(value = "/hello")
    public String HelloPage(){
        return "hello";
    }

    @RequestMapping(value = "/users")
    public String getUsers(Model model){
        // List<String> users = List.of("mohammed" ,"hassan" ,"mounir" ,"jamila" ,"imad" ,"l3awni");
        // model.addAttribute("users", users);
        // return "users";

        String[][] users = {
            {"mohammed" , "mohammed@gmail.com" , "22" , "married"},
            {"hassan" , "hassan@gmail.com" , "30" , "married"},
            {"salma" , "salma@gmail.com" , "18" , "single"},
            {"rihab" , "rihab@gmail.com" , "10" , "single"}
        };

        model.addAttribute("users" , users);

        return "users";
    }
    
}



// @RestController
// public class MyController {
//     @GetMapping("/hello")
//     public String SayHello(){
//         return "Hello world";
//     }
// }
