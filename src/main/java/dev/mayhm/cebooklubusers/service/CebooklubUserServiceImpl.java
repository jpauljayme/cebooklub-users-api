package dev.mayhm.cebooklubusers.service;

import dev.mayhm.cebooklubusers.entity.CebooklubUser;
import dev.mayhm.cebooklubusers.repository.CebooklubUserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CebooklubUserServiceImpl implements CebooklubUserService {

    private final CebooklubUserRepository cebooklubUserRepository;

    public CebooklubUserServiceImpl(CebooklubUserRepository cebooklubUserRepository) {
        this.cebooklubUserRepository = cebooklubUserRepository;
    }

    @Override
    public Optional<CebooklubUser> getUserByUsernameAndPassword(String username,
                                                                String password) {
        return Optional.ofNullable(cebooklubUserRepository.findByNameAndPassword(username, password));
    }
}
