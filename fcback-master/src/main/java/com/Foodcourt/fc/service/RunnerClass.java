package com.Foodcourt.fc.service;

import com.Foodcourt.fc.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class RunnerClass implements CommandLineRunner {

    @Autowired
    UserService userService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
//        userService.saveUser(new User("vimal@gmail.com",passwordEncoder.encode("foodie")));
//        userService.saveUser(new User("venkate@gmail.com",passwordEncoder.encode("foodie")));
    }
}
