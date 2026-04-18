package com.rimeh.users;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.rimeh.users.entities.Role;
import com.rimeh.users.entities.User;
import com.rimeh.users.service.UserService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class UsersMicroservicesApplication {

    @Autowired
    UserService userService;

    /*@PostConstruct
    void init_users() {

        userService.addRole(new Role(null, "ADMIN"));
        userService.addRole(new Role(null, "USER"));

        userService.saveUser(new User(null, "admin", "123", true, null));
        userService.saveUser(new User(null, "rimeh", "123", true, null));
        userService.saveUser(new User(null, "salah", "123", true, null));

        userService.addRoleToUser("admin", "ADMIN");
        userService.addRoleToUser("admin", "USER");
        userService.addRoleToUser("rimeh", "USER");
        userService.addRoleToUser("salah", "USER");
    }*/

    /*@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(UsersMicroservicesApplication.class, args);
    }
}