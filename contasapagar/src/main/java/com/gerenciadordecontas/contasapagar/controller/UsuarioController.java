package com.gerenciadordecontas.contasapagar.controller;

import com.gerenciadordecontas.contasapagar.model.UsuarioModel;
import com.gerenciadordecontas.contasapagar.services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class UsuarioController {
@Autowired
    private UsuarioServices usuarioServices;

@GetMapping(path = "/USUARIO_TB")
    public List<UsuarioModel> buscarUsuario() {
return usuarioServices.buscarTodos();
}
@GetMapping(path = "/USUARIO_TB/{id}")

    public Optional<UsuarioModel> buscarUserId(@PathVariable long id) {
    return usuarioServices.buscarID(id);
}

@PostMapping(path = "/USUARIO_TB")
    public UsuarioModel cadastrarUser()
}
