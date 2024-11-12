package com.registerform.controller;

import com.registerform.entity.User;
import com.registerform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Use Spring's Model here
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {


    @Autowired
    private UserService service;

    @GetMapping("/")
    public String register(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "register";
    }

    @PostMapping("/registerUser")
    public String registerUser(@ModelAttribute("user") User user) {
        String result="error";
        System.out.println(user);

        if(user.getPassword().equals(user.getCpassword())){
            try{
                service.registerUser(user);
                result= "home";
            }
            catch (Exception e){
                result= "error";
            }
        }

        return result;

    }
}
