package com.backProject.emailSender.service;

import com.backProject.emailSender.domain.User;

public interface UserService {
    User saveUser(User user);
    Boolean verifyToken(String token);
}
