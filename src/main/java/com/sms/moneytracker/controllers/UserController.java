package com.sms.moneytracker.controllers;

import com.sms.moneytracker.models.User;
import com.sms.moneytracker.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
@Slf4j
public class UserController {

    private UserService userService;
    @PostMapping
    public User save(@RequestBody User user) {
        log.debug("Save user: " + user);
        return this.userService.save(user);
    }
    @GetMapping
    public List<User> getUsers() {
        return this.userService.getUsers();
    }
}
