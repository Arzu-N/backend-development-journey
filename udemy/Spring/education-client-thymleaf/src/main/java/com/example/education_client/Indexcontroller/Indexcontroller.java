package com.example.education_client.Indexcontroller;

import com.example.education_client.Restclient.CommonResponse;
import com.example.education_client.Restclient.EducationRestClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Method;
import java.util.List;

@Controller

public class Indexcontroller {
    @GetMapping("/")
    public String index(Model model){
    List<CommonResponse.StudentResponse> students = EducationRestClient.getstudents();
    model.addAttribute("students",students);
    return "index";
    }
}
