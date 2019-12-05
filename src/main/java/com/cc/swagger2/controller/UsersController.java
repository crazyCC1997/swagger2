package com.cc.swagger2.controller;


import com.cc.swagger2.bean.Users;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class UsersController {

    @RequestMapping("/addUser")
    public String showPage(Users users){
        return "add";
    }

    @RequestMapping("/saveUser")
    public String saveUser(@Valid Users users, BindingResult result){

        if (result.hasErrors()) {
            return "add";
        }
        System.out.println(users);
        return "ok";
    }
}
