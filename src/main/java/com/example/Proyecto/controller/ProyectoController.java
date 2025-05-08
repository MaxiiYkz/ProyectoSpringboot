package com.example.Proyecto.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Proyecto.model.Usuario;
import com.example.Proyecto.services.UsuarioService;

@RestController
@RequestMapping("/api/v0/Usuario")
public class ProyectoController {
    @Autowired
    private UsuarioService serviceUsuarios;

    @GetMapping()
    public List<Usuario> obtenerUsuarios(){
        return serviceUsuarios.obtenerUsuario();
    }

    @PostMapping
        public Usuario guardar(Usuario usu){
            return serviceUsuarios.guardarUsuario(usu);
    }

    @DeleteMapping("(idUsuario)")
        public void eliminarUsuario(@PathVariable int idUsuario){
            return;
        }
}
