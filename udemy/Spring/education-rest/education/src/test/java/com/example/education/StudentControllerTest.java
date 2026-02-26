package com.example.education;

import com.example.education.CommonDTO.CommonDTO;
import com.example.education.controller.StudentController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = EducationApplication.class,webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)

public class StudentControllerTest  {
    @Autowired
    StudentController contoller;
    @Autowired
    private TestRestTemplate resttemplate;

    @LocalServerPort
    private int port;
    @Test
    public void getlist(){
        CommonDTO resp = resttemplate.getForObject("http://localhost:" + port+"/education/students", CommonDTO.class);
        System.out.println(resp);

    }
}//tam deyil
