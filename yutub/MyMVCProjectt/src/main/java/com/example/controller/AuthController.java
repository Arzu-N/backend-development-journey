package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {
    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }
    @PostMapping("/login")
    public String doLogin(@RequestParam("username") String username, @RequestParam("password") String password, Model model){
        if("admin".equals(username)&&"1234".equals(password)){
            return "redirect:/home";
        }
        else{
            model.addAttribute("error","invalid username or password");
            return "login";
        }
    }
    @GetMapping("/register")
    public String registerPage(){
        return "register";
    }
    @PostMapping("/register")
    public String doRegister(@RequestParam("username") String username,@RequestParam ("password")String password,Model model){
        model.addAttribute("message","Qeydiyyat ugurla tamamlandi");
        return "login";
    }
}
