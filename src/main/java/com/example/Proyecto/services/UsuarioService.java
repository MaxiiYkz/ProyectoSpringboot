package com.example.Proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto.model.Usuario;
import com.example.Proyecto.repository.ClienteRepository;


@Service
public class UsuarioService {
    @Autowired
    private ClienteRepository repositorioClientes;

        public List<Usuario> obtenerUsuario(){
            return repositorioClientes.obtenerUsuario();
        }
        public Usuario guardarUsuario(Usuario usu){
            return repositorioClientes.guardarUsuario(usu);
        }
        public void eliminarUsuario(int idUsuario){
            return;
        }
}
