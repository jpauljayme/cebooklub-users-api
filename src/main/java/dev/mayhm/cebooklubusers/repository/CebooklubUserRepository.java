package dev.mayhm.cebooklubusers.repository;

import dev.mayhm.cebooklubusers.entity.CebooklubUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CebooklubUserRepository
        extends CrudRepository<CebooklubUser, Integer> {

    CebooklubUser findByNameAndPassword(String name, String password);
}
