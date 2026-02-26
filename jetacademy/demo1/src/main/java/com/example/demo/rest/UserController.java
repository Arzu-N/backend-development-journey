package com.example.demo.rest;

import com.example.demo.dao.entity.User;
import com.example.demo.dto.UserRequestDto;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public  Map<String,Object> getUsers(@RequestParam(required = false)String firstName,@RequestParam(required = false)String surname,
                               @RequestParam(required = false)Integer age,@RequestParam(required = false)Double balance,
                               @RequestParam(defaultValue = "0")int pageNumber,@RequestParam(defaultValue = "2")int pageSize){
        Page<User> users = userService.getUsers(firstName, surname, age, balance, pageNumber, pageSize);
        List<Map<String,Object>> content = users.getContent().stream().map(user -> {
            Map<String,Object> map = new HashMap<>();
            map.put("id", user.getId());
                    map.put ("firstName", user.getFirstName());
                    map.put( "age", user.getAge());
                    map.put("balance", user.getBalance());
            return map;}).toList();

        Map<String, Object> response = new HashMap<>();
        response.put("content",content);
        response.put("pageNumber",users.getPageable().getPageNumber()+1);
        response.put("pageSize",users.getPageable().getPageSize());
        response.put("totalPage",users.getTotalPages());
        response.put("totalElements", users.getTotalElements());
        return response;
    }

    @PostMapping("/user")
    public void addUser(@RequestBody UserRequestDto dto){
        userService.addUser(dto);
    }
}
