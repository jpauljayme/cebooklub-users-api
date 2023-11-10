package dev.mayhm.cebooklubusers.controller;

import dev.mayhm.cebooklubusers.entity.CebooklubUser;
import dev.mayhm.cebooklubusers.service.CebooklubUserServiceImpl;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserControllerImpl implements UserController{

    private final CebooklubUserServiceImpl userService;

    public UserControllerImpl(CebooklubUserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public Optional<CebooklubUser> getUserByNameAndPassword(String username, String password) {
        return userService.getUserByUsernameAndPassword(username, password);
    }
}
