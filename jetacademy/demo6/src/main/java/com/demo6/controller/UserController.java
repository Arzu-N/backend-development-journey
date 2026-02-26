package com.demo6.controller;

import com.demo6.dto.UserRequestDto;
import com.demo6.dto.UserResponse;
import com.demo6.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
@Tag(name = "User API", description = "USER")
public class UserController {
    @Schema(description = "User service ")
    private final UserService userService;
@Operation(summary="Userleri add edirik")
    @PostMapping
    public ResponseEntity<UserResponse> addUser(@RequestBody UserRequestDto dto){
       return ResponseEntity.status(HttpStatus.CREATED).body(userService.addUser(dto));
    }
}
