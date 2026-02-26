package com.example.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Profile {
    @GetMapping("profile")
    public ModelAndView showProfile(HttpSession session){
        String user = (String) session.getAttribute("user");
   if(user==null){
       new ModelAndView("redirect:login");
   }

       ModelAndView mv = new ModelAndView("profile");
       mv.addObject("user",user);
       return mv;

    }
    @GetMapping("logout")
    public ModelAndView showLogout(HttpSession session){
        session.invalidate();
        return new ModelAndView("redirect:login");
    }
}
