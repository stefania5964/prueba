package com.prueba;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
@Entity
@Getter
@Setter
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nombre;
    private String caracteristicas;
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<Precio> precios;
    @ManyToOne
    private Empresa empresa;
    @ManyToMany
    private List<Categoria> categorias;

}
