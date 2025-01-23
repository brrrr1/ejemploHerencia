package com.salesianos.herencia.mappedSuperClass;

import com.salesianos.herencia.mappedSuperClass.model.PlantillaBaloncesto;
import com.salesianos.herencia.mappedSuperClass.model.PlantillaFutbol;
import com.salesianos.herencia.mappedSuperClass.repos.PlantillaBaloncestoRepository;
import com.salesianos.herencia.mappedSuperClass.repos.PlantillaFutbolRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class DatosEjemplo {

    private final PlantillaFutbolRepository plantillaFutbolRepository;
    private final PlantillaBaloncestoRepository plantillaBaloncestoRepository;

    @PostConstruct
    public void init() {

        PlantillaFutbol futbol = new PlantillaFutbol(
                25, // cantidadJugadores
                500_000_000, // costeSalarios (valor estimado)
                List.of("Carlo Ancelotti", "Davide Ancelotti", "Luis Llopis", "Francesco Mauri"), // cuerpoTecnico
                List.of("Thibaut Courtois", "Andriy Lunin"), // porteros
                List.of("Dani Carvajal", "Antonio Rüdiger", "David Alaba", "Éder Militão", "Ferland Mendy", "Lucas Vázquez", "Fran Garcia", "Raúl Asencio", "Jesús Vallejo"), // defensas
                List.of("Jude Bellingham", "Aurélien Tchouaméni", "Federico Valverde", "Dani Ceballos", "Luka Modrić", "Eduardo Camavinga", "Arda Güler"), // centrocampistas
                List.of("Kylian Mbappé", "Vinícius Júnior", "Rodrygo Goes", "Endrick", "Brahim Díaz") // delanteros
        );

        plantillaFutbolRepository.save(futbol);


        PlantillaBaloncesto baloncesto = new PlantillaBaloncesto(
                15, // cantidadJugadores
                30_000_000, // costeSalarios
                List.of("Chus Mateo", "Pablo Laso", "Lolo Sainz"), // cuerpoTecnico
                List.of("Sergio Llull", "Facundo Campazzo"), // bases
                List.of("Rudy Fernández", "Mario Hezonja"), // escoltas
                List.of("Gabriel Deck", "Dzanan Musa"), // aleros
                List.of("Guerschon Yabusele", "Anthony Randolph"), // alaPivots
                List.of("Walter Tavares", "Vincent Poirier") // pivots
        );


        plantillaBaloncestoRepository.save(baloncesto);

        System.out.println("Datos insertados en la base de datos:");
        System.out.println("Plantilla de Baloncesto: " + baloncesto);
        System.out.println("Plantilla de Fútbol: " + futbol);
    }
}
