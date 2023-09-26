package com.tecverde.database.services;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tecverde.database.entities.UserEntity;
import com.tecverde.database.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity salvar(UserEntity user) {
        return userRepository.save(user);
    }

    public List<UserEntity> listarTodos() {
        return userRepository.findAll();
    }

    public UserEntity listarPorNomeUsuario(String nome) {
        return userRepository.findByNome(nome);
    }

    public void apagarPorNomeUsuario(String nome) {
        userRepository.deleteByNome(nome);
    }

    public UserEntity atualizarUsuario(String numeroDocumento, UserEntity novoUsuario)
            throws UserPrincipalNotFoundException {
        if (userRepository.existsByNumeroDocumento(numeroDocumento)) {
            UserEntity usuario = novoUsuario;
            return userRepository.save(usuario);
        }
        throw new UserPrincipalNotFoundException(numeroDocumento);

    }

    public void apagarUsuarios() {
        userRepository.deleteAll();
    }

}
