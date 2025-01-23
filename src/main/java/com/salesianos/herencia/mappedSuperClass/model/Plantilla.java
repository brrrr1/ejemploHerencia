package com.salesianos.herencia.mappedSuperClass.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Plantilla {

    @Id
    @GeneratedValue
    protected Long id;

    protected int cantidadJugadores;
    protected double costeSalarios;

    @ElementCollection
    protected List<String> cuerpoTecnico;

    public Plantilla(int cantidadJugadores, double costeSalarios, List<String> cuerpoTecnico) {
        this.cantidadJugadores = cantidadJugadores;
        this.costeSalarios = costeSalarios;
        this.cuerpoTecnico = cuerpoTecnico;
    }
}
