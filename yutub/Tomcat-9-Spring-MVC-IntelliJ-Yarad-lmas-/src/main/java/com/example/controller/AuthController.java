package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String doLogin(@RequestParam String username, @RequestParam String password, Model model) {
        if ("admin".equals(username) && "1234".equals(password)) {
            return "redirect:/home";
        } else {
            model.addAttribute("error", "Yanlış istifadəçi adı və ya şifrə!");
            return "login";
        }
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @PostMapping("/register")
    public String doRegister(@RequestParam String username, @RequestParam String password, Model model) {
        // Sadə nümunə, real DB ilə əvəz edilə bilər
        model.addAttribute("message", "Qeydiyyat uğurla tamamlandı!");
        return "login";
    }
}
