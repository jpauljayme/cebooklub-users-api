package dev.mayhm.cebooklubusers.controller;

import dev.mayhm.cebooklubusers.entity.CebooklubUser;

import java.util.Optional;

public interface UserController {
    Optional<CebooklubUser> getUserByNameAndPassword(String username, String password);
}
