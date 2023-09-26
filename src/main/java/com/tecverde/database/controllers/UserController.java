package com.tecverde.database.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecverde.database.entities.UserEntity;
import com.tecverde.database.services.UserService;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserEntity> criarUsuario(@RequestBody UserEntity user) {
        UserEntity savedUser = userService.salvar(user);
        System.out.println("Salvando Usuário: " + user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @PostMapping("/teste")
    public void criarUsuarios(@RequestBody UserEntity user) {
        System.out.println("Criando Usuário: " + user);
    }

    @GetMapping("/{nomeUsuario}")
    public ResponseEntity<UserEntity> listarUsuario(@PathVariable String nomeUsuario) {
        UserEntity user = userService.listarPorNomeUsuario(nomeUsuario);
        return (user != null) ? new ResponseEntity<>(user, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{nomeUsuario}")
    public ResponseEntity<UserEntity> apagarUsuario(@PathVariable String nomeUsuario) {
        userService.apagarPorNomeUsuario(nomeUsuario);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<List<UserEntity>> listarUsuarios() {
        List<UserEntity> user = userService.listarTodos();
        return (user != null) ? new ResponseEntity<>(user, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
