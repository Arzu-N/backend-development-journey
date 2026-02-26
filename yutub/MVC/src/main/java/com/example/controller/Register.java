package com.example.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Register {
    private Map<String,String>fakeUsers=new HashMap<>();
    @GetMapping("/register")
    public ModelAndView showRegister(){
        return new ModelAndView("register");
    }
    @PostMapping("/register")
    public ModelAndView doRegister(@RequestParam String username, @RequestParam String password, HttpSession session){
        if(fakeUsers.containsKey(username)){
            ModelAndView mv=new ModelAndView("register");
            mv.addObject("error","istifadeci movcuddur");
            return mv;
        }
        fakeUsers.put(username,password);
        session.setAttribute("user",username);
        return new ModelAndView("redirect:profile");
    }
}
