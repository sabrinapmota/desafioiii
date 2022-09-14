package com.gerenciadordecontas.contasapagar.services;

import com.gerenciadordecontas.contasapagar.model.UsuarioModel;
import com.gerenciadordecontas.contasapagar.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UsuarioServices {
    @Autowired
    private IUsuarioRepository usuarioRepository;

    public List<UsuarioModel> buscarTodos() {
        return usuarioRepository.findAll();
    }

    public Optional<UsuarioModel> buscarID(Long id) {
        return usuarioRepository.findById(id);
    }

    public UsuarioModel cadastrarUsuario(UsuarioModel usuarioModel) {
        usuarioModel.getCodigo();
        usuarioModel.getNome();
        usuarioModel.getDataNascimento();
        usuarioModel.getCpf();
        usuarioModel.getEmail();

        return usuarioRepository.save(usuarioModel);
    }

    public UsuarioModel alteraUsuario(UsuarioModel usuarioModel) {
        usuarioModel.getNome();
        usuarioModel.getDataNascimento();
        usuarioModel.getCpf();
        usuarioModel.getEmail();

        return usuarioRepository.save(usuarioModel);
    }
    public void deletarUser(long id) {
        usuarioRepository.deleteById(id);
    }

}