package com.prueba;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
@Entity
@Getter
@Setter
public class Cliente {
    @Id
    private String correo;
    private String nombre;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToMany(mappedBy = "cliente")
    private List<Orden> ordenes;
}
