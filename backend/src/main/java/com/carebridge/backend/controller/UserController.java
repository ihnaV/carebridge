package com.carebridge.backend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carebridge.backend.dto.CreateUserRequest;
import com.carebridge.backend.dto.UserResponse;
import com.carebridge.backend.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping({"/api/users", "/api/user"})
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // @PostMapping
    // public UserResponse createUser(@RequestBody @NonNull CreateUserRequest request) {
    //     return userService.createUser(request);
    // }

    @PostMapping
    public ResponseEntity<UserResponse> createUser(@Valid @RequestBody CreateUserRequest request) {
        log.info("Received create user request for email={}", request.getEmail());
        UserResponse userResponse = userService.createUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(userResponse);
    }
}
