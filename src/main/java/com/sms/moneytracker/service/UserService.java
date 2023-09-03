package com.sms.moneytracker.service;

import com.sms.moneytracker.models.User;
import com.sms.moneytracker.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;
    public User save(User user) {
        return this.userRepository.save(user);
    }
    public List<User> getUsers() {
        return this.userRepository.findAll();
    }
}
