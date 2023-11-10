package dev.mayhm.cebooklubusers.service;

import dev.mayhm.cebooklubusers.entity.CebooklubUser;

import java.util.Optional;

public interface CebooklubUserService {
    Optional<CebooklubUser> getUserByUsernameAndPassword(String username, String password);
}
