package com.carebridge.backend.service;

import org.springframework.lang.NonNull;

import com.carebridge.backend.entity.User;

public interface UserService {

    User createUser(@NonNull User user);

}