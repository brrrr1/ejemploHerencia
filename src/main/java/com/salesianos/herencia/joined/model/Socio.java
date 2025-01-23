package com.salesianos.herencia.joined.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
public class Socio {

    @Id
    @GeneratedValue
    private long id;

    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private String dni;
    private LocalDate fechaNacimiento;
    private LocalDate fechaSocio;
    private double cuota;

    public Socio(String nombre, String apellidos, String email, String telefono, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.dni = dni;
    }
}
