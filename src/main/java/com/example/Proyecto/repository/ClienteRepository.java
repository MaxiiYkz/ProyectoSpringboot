package com.example.Proyecto.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Proyecto.model.Usuario;

@Repository
public class ClienteRepository {

    private List<Usuario> listarUsuario = new ArrayList<>();

    public List<Usuario> obtenerUsuario(){
        return listarUsuario;
    }

    public Usuario guardarUsuario(Usuario usu){
        listarUsuario.add(usu);
        return usu;
    }

    public void eliminarUsuario(String Usuario){
        return;
    }

}
