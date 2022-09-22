package com.vuelafacil.vuelafacil.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vuelafacil.vuelafacil.dao.UsuarioDao;
import com.vuelafacil.vuelafacil.models.Usuario;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Juan");
        usuario.setApellido("Perez");
        usuario.setEmail("andres@gmail.com");
        usuario.setTelefono("123456789");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios",method = RequestMethod.GET)
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuarios(@RequestBody Usuario usuario){
        usuarioDao.registrar(usuario);
    }

    @RequestMapping(value = "usuario121")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Juan");
        usuario.setApellido("Perez");
        usuario.setEmail("andres@gmail.com");
        usuario.setTelefono("123456789");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable long id){
        usuarioDao.eliminar(id);
    }

    @RequestMapping(value = "usuario345")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Juan");
        usuario.setApellido("Perez");
        usuario.setEmail("andres@gmail.com");
        usuario.setTelefono("123456789");
        return usuario;
    }
}