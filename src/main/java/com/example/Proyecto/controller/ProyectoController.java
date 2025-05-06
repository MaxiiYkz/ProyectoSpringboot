package com.example.Proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Proyecto.services.UsuarioService;

@RestController
@RequestMapping("api/v0/Usuario")
public class ProyectoController {
    @Autowired
    private UsuarioService serviceUsuarios;

    @GetMapping()
        public List<Usuario>;
    

}
