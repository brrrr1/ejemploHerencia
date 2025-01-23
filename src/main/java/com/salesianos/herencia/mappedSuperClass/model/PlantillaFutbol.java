package com.salesianos.herencia.mappedSuperClass.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PlantillaFutbol extends Plantilla {

    private List<String> porteros;
    private List<String> defensas;
    private List<String> centrocampistas;
    private List<String> delanteros;

    public PlantillaFutbol(int cantidadJugadores, double costeSalarios, List<String> cuerpoTecnico, List<String> porteros, List<String> defensas, List<String> centrocampistas, List<String> delanteros) {
        super(cantidadJugadores, costeSalarios, cuerpoTecnico);
        this.porteros = porteros;
        this.defensas = defensas;
        this.centrocampistas = centrocampistas;
        this.delanteros = delanteros;

    }
}
