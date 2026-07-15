package com.carebridge.backend.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.carebridge.backend.dto.CreateUserRequest;
import com.carebridge.backend.dto.UserResponse;
import com.carebridge.backend.entity.User;
import com.carebridge.backend.entity.UserRole;
import com.carebridge.backend.entity.UserStatus;
import com.carebridge.backend.repository.UserRepository;
import com.carebridge.backend.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserResponse createUser(CreateUserRequest request) {
        log.info("Creating user record for email={}", request.getEmail());

        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email address is already registered");
        }

        UserRole role = request.getRole() == null ? UserRole.PATIENT : request.getRole();

        User newUser = new User();

        newUser.setFirstName(request.getFirstName());
        newUser.setMiddleName(request.getMiddleName()); 
        newUser.setLastName(request.getLastName());
        newUser.setMobileNumber(request.getMobileNumber());
        newUser.setEmail(request.getEmail());
        newUser.setPassword(passwordEncoder.encode(request.getPassword()));
        newUser.setRole(role);
        newUser.setStatus(UserStatus.ACTIVE);

        User savedUser = userRepository.save(newUser);
        return new UserResponse(
            savedUser.getId(),
            savedUser.getFirstName(),
            savedUser.getMiddleName(),
            savedUser.getLastName(),
            savedUser.getMobileNumber(),
            savedUser.getEmail(),
            savedUser.isEmailVerified(),
            savedUser.getRole(),
            savedUser.getStatus(),
            savedUser.getCreatedAt().toString(),
            savedUser.getUpdatedAt().toString()
        );
    }



}

