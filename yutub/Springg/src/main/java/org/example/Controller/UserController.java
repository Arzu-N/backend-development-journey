package org.example.Controller;

import org.example.Model.User;
import org.example.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService service;
    @GetMapping
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id){
        return service.getUserById(id);
    }
    @PostMapping
    public void addUser(@RequestBody User user){
        service.addUser(user);}
    @PutMapping("/{id}")
    public void updateUser(@PathVariable int id,@RequestBody User user){
        service.updateUser(id,user);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){
        service.deleteUser(id);
    }
}
