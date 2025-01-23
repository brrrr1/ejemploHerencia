package com.salesianos.herencia.joined.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class SocioAbonado extends Socio {

    private String asiento;
    private String fechaAbono;

    public SocioAbonado(String nombre, String apellidos, String email, String telefono, String dni, String asiento, String fechaAbono) {
        super(nombre, apellidos, email, telefono, dni);
        this.asiento = asiento;
        this.fechaAbono = fechaAbono;
    }



}
