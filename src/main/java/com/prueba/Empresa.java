package com.prueba;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Empresa {
    @Id
    private String nit;
    private String nombre;
    private String direccion;
    private String telefono;

}
