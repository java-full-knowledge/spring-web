package com.jfk.controller;


import com.jfk.UserNotFoundException;
import com.jfk.UserService;
import com.jfk.entity.User;
import com.jfk.valueobject.UserCreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return toJsonResponse(user);
    }


    @RequestMapping(path = "/find", method = {RequestMethod.GET})
    @ResponseBody
    public Map<String, String> find(@PathVariable("username") @RequestParam(name = "username") String username) {
        try {
            User user = userService.find(username);
            return toJsonResponse(user);
        } catch (UserNotFoundException ex) {
            return Map.of("message", ex.getMessage());
        }
    }
    @RequestMapping(path = "/test", method = {RequestMethod.GET})
    @ResponseBody
    public String test() {
        return "test";
    }
    private Map<String, String> toJsonResponse(User user) {
        Map<String, String> response = new HashMap<>();
        response.put("username", user.getUserName());
        response.put("password", user.getPassword());
        response.put("id", user.getId().toString());
        response.put("message", "Created ...");
        return response;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
