package com.salesianos.herencia.mappedSuperClass.repos;

import com.salesianos.herencia.mappedSuperClass.model.Plantilla;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantillaRepository extends JpaRepository<Plantilla, Long> {
}
