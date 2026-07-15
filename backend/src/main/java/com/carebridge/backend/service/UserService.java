package com.carebridge.backend.service;

import com.carebridge.backend.dto.CreateUserRequest;
import com.carebridge.backend.dto.UserResponse;

public interface UserService {

    UserResponse createUser(CreateUserRequest user);

}