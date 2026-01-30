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

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public AppUser createUser(@RequestBody AppUser userEntity){
        return userService.create(userEntity);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<AppUser> getAll (){
        return userService.getAll();
    }

    @GetMapping("/getById/{id}")
    @ResponseStatus(HttpStatus.OK)
    public AppUser getById(@PathVariable Long id){
        return userService.getById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public AppUser update(@PathVariable Long id, AppUser UserEntity){
        return userService.update(id, UserEntity);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        userService.deleteById(id);
    }
}
