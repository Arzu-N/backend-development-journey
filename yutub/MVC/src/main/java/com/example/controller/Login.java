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
public class Login {
    private Map<String,String>fakeUsers=new HashMap<>();
    @GetMapping("login")
    public ModelAndView showLogin(){
        return new ModelAndView("login");
    }
    @PostMapping("login")
    public ModelAndView doLogin(@RequestParam String username, @RequestParam String password, HttpSession session){
        if(password!=null&&password.equals(fakeUsers.get(username))){
            session.setAttribute("user",username);
            return new ModelAndView("profile");
        }

            ModelAndView mv=new ModelAndView("login");
            mv.addObject("error","invalid username or password");
            return mv;

    }
}
