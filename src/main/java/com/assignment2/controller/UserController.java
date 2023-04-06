package com.assignment2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public String authenticate(@RequestParam("username") String username, @RequestParam("password") String password) {
        if (username.equals("admin") && password.equals("admin123")) {
            return "Valid user";
        } else {
            return "Invalid user";
        }
    }

}
