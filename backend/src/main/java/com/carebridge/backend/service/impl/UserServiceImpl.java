package com.carebridge.backend.service.impl;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import com.carebridge.backend.entity.User;
import com.carebridge.backend.repository.UserRepository;
import com.carebridge.backend.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(@NonNull User user) {
        return userRepository.save(user);
    }

}

