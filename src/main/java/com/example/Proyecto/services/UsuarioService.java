package com.example.Proyecto.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Proyecto.model.Usuario;


@Service
public class UsuarioService {

    private UsuarioService repositorioClientes;

        public List<Usuario> obtenerUsuario(){
            return repositorioClientes.obtenerUsuario();
        }
        public Usuario guardarUsuario(Usuario usu){
            return repositorioClientes.guardarUsuario(usu);
        }
        public void eliminarUsuario(String Usuario){
            return;
        }
}
