package com.ltc.heliosspring.controller;

import com.ltc.heliosspring.model.AppUser;
import com.ltc.heliosspring.sevice.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


}
