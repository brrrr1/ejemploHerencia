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
public class PlantillaBaloncesto extends Plantilla{

    private List<String> bases;
    private List<String> escoltas;
    private List<String> aleros;
    private List<String> alaPivots;
    private List<String> pivots;

    public PlantillaBaloncesto(int cantidadJugadores, double costeSalarios, List<String> cuerpoTecnico, List<String> bases, List<String> escoltas, List<String> aleros, List<String> alaPivots, List<String> pivots) {
        super(cantidadJugadores, costeSalarios, cuerpoTecnico);
        this.bases = bases;
        this.escoltas = escoltas;
        this.aleros = aleros;
        this.alaPivots = alaPivots;
        this.pivots = pivots;
    }


}
