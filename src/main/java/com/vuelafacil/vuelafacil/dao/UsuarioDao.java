package com.vuelafacil.vuelafacil.dao;

import java.util.List;

import com.vuelafacil.vuelafacil.models.Usuario;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(long id);

    void registrar(Usuario usuario);

    boolean verificarCredenciales(Usuario usuario);
    
}
