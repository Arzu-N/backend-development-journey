package com.student.controller;

import com.student.controller.entity.StudentEntity;
import com.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class StudentController {
/*    @GetMapping("/get")
    public List<String> helloText(String name){

       return List.of("Arzu","Gunay").stream().filter(l->l.equals(name)).toList();
    }
}*/
/*@GetMapping("/get")
public List<String> helloText(Integer id){

*//*    return Map.of(1,"Arzu",2,"Gunay").entrySet().stream().filter(l->l.getKey().equals(id)).
            collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));*//*

     *//*    return Map.of(1,"Arzu",2,"Gunay").entrySet().stream().filter(l->l.getKey().equals(id)).
            map(Map.Entry::getValue).toList();
}*//*}*/

    private final StudentRepository studentrepo;
    private static Map<Long, String> map = new HashMap<>();
    private static Long id = 0L;

    @GetMapping("/get")
    public StudentEntity getAllStudent(long id) {
        //return studentrepo.findAll();
        return studentrepo.findById(id).orElseThrow();
    }

    @GetMapping("/gets")
    public List<StudentEntity> getAllStudents() {
        return studentrepo.findAll();
    }

    @PostMapping("/post")
    public void insertStudent(@RequestBody StudentEntity student) {
        studentrepo.save(student);
    }

    @PutMapping("/put/{id}")
    public void putStudent(@PathVariable Long id, @RequestBody StudentEntity student) {
        StudentEntity user = studentrepo.findById(id).orElseThrow();
        user.setAge(student.getAge());
        user.setBalance(student.getBalance());
        user.setName(student.getName());
        user.setSurname(student.getSurname());
        studentrepo.save(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Long id) {
        StudentEntity user = studentrepo.findById(id).orElseThrow();
        studentrepo.delete(user);
    }

    @PostMapping("/posts")
    public static Map<Long, String> update(String name) {
        id++;
        map.put(id, name);
        return map;
    }
    @Bean
    @Component
    @GetMapping("/search")
    public String  getAllStudents( Long id) {
        if(map.get(id)==null){
            return "istifadeci yoxdi";

        }
        return map.get(id);
    }
    @DeleteMapping("/delete")
    public void  deleteStudentt(@RequestParam Long id) {
       map.remove(id);
    }
}
