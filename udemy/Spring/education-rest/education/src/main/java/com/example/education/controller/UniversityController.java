package com.example.education.controller;

import com.example.education.entity.Student;
import com.example.education.entity.University;
import com.example.education.repo.Universityrepodata;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
@RestController
@RequestMapping("/universitiess")
public class UniversityController {
        private final Universityrepodata datarepo;
        public UniversityController( Universityrepodata datarepo) {
            this.datarepo=datarepo;}
    @PostMapping
public List<University> insert(){
            University u=new University();
            u.setName("GDU");
            Student s1=new Student();
            s1.setName("Ulker");
            s1.setUniversity(u);
            Student s2=new Student();
            s2.setName("Semed");
            s2.setUniversity(u);
            u.setStudents(Arrays.asList(s1,s2));
            datarepo.save(u);
            return datarepo.findAll();
}
    @RequestMapping(method=RequestMethod.GET)
    List<University>getAll(@RequestParam(required=false) String name){
if("TEST".equalsIgnoreCase(name)){
    throw new IllegalArgumentException("Teste icaze verilmedi");
}
            return datarepo.findAll();
    }
    }


