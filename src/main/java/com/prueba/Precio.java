package com.prueba;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Precio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String moneda;
    private Double valor;
    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;
}
