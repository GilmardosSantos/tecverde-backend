package com.tecverde.database.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tecverde.database.entities.UserEntity;

public interface UserRepository extends MongoRepository<UserEntity, String> {
    UserEntity findByNome(String nome);

    UserEntity findByNumeroDocumento(String numeroDocumento);

    UserEntity deleteByNome(String nome);

    boolean existsByNumeroDocumento(String numeroDocumento);

}
