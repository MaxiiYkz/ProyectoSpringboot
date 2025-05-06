package com.example.Proyecto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private String usuario;
    private String contraseña;
    private String correo;
    private int telefono;

}
