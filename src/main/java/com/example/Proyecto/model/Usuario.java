package com.example.Proyecto.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {
    @Id
    @Generated()
    private int idUsuario;

    private String usuario;
    private String contraseña;
    private String correo;
    private int telefono;

}
