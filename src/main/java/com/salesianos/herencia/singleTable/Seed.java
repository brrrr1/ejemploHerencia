package com.salesianos.herencia.singleTable;

import com.salesianos.herencia.singleTable.model.Delantero;
import com.salesianos.herencia.singleTable.model.Portero;
import com.salesianos.herencia.singleTable.repos.JugadorRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class Seed {

    private final JugadorRepository jugadorRepo;

    @PostConstruct
    public void init() {
        // Crear instancias de jugadores (Delanteros y Porteros)
        Delantero delantero1 = new Delantero(null, "Juan Pérez", 25, 1500.0, 50, 9, 15);
        Delantero delantero2 = new Delantero(null, "Carlos Sánchez", 28, 1800.0, 60, 11, 20);
        Portero portero1 = new Portero(null, "Luis Gómez", 30, 2000.0, 80, 1, 25);
        Portero portero2 = new Portero(null, "David Rodríguez", 32, 2200.0, 100, 13, 30);

        // Guardar los jugadores en el repositorio
        jugadorRepo.save(delantero1);
        jugadorRepo.save(delantero2);
        jugadorRepo.save(portero1);
        jugadorRepo.save(portero2);


        System.out.println("Datos insertados en la base de datos:");
        System.out.println("Delantero 1: " + delantero1 + "goles:" + delantero1.getGoles());
        System.out.println("Delantero 2: " + delantero2);
        System.out.println("Portero 1: " + portero1);
        System.out.println("Portero 2: " + portero2);
    }
}
