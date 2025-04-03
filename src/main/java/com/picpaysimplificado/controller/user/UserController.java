package com.picpaysimplificado.controller.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.picpaysimplificado.model.user.User;
import com.picpaysimplificado.service.users.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public User criarUsuario(@RequestBody User user) {
        return userService.saveUser(user);
    }
    
}
