package com.jwt.example.controllers;

import com.jwt.example.models.user;
import com.jwt.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
        @Autowired
        private UserService userService;

        //http://localhost:8081/home/users
        @GetMapping("/users")
        public List<user> getUser() {
            System.out.println("getting users");
            return userService.getUser();
        }
        @GetMapping("/current-user")
        public String getLoggedInUser(Principal principal){
            return principal.getName();
        }
}

