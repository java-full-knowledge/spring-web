package com.jfk.controller;


import com.jfk.UserService;
import com.jfk.entity.User;
import com.jfk.valueobject.UserCreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author William Arustamyan
 */

@RequestMapping("/users")
@RestController
public class UserRegistrationController {

    private UserService userService;

    @RequestMapping(path = "/create", method = {RequestMethod.POST})
    public Map<String, String> createUser(@RequestBody UserCreateRequest createRequest) {
        System.out.println(createRequest);
        User user = userService.create(createRequest);
        Map<String, String> response = new HashMap<>();
        response.put("username" , user.getUserName());
        response.put("password" , user.getPassword());
        response.put("id" , user.getId().toString());
        response.put("message" , "Created ...");
        return response;
    }


    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
