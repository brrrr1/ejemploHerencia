package com.salesianos.herencia.joined;

import com.salesianos.herencia.joined.model.Socio;
import com.salesianos.herencia.joined.model.SocioAbonado;
import com.salesianos.herencia.joined.repos.SocioAbonadoRepo;
import com.salesianos.herencia.joined.repos.SocioRepo;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DataSeed {

    private final SocioRepo socioRepo;
    private final SocioAbonadoRepo socioAbonadoRepo;

    @PostConstruct
    public void init() {

        Socio socio1 = Socio.builder()
                .nombre("Juan")
                .apellidos("Perez")
                .email("juanperez@gmail.com")
                .telefono("123456789")
                .dni("12345678A")
                .fechaNacimiento(java.time.LocalDate.of(1990, 1, 1))
                .fechaSocio(java.time.LocalDate.of(2021, 1, 1))
                .cuota(50.0)
                .build();

        Socio socio2 = Socio.builder()
                .nombre("Ana")
                .apellidos("Lopez")
                .email("analopez@gmail.com")
                .telefono("987654321")
                .dni("87654321B")
                .fechaNacimiento(java.time.LocalDate.of(1995, 1, 1))
                .fechaSocio(java.time.LocalDate.of(2021, 1, 1))
                .cuota(30.0)
                .build();

        socioRepo.save(socio1);
        socioRepo.save(socio2);

        SocioAbonado socioAbonado1 = SocioAbonado.builder()
                .nombre("Florentino")
                .apellidos("Perez")
                .email("florenperez@gmail.com")
                .telefono("123456789")
                .dni("12345678A")
                .asiento("A1")
                .fechaAbono("2021-01-01")
                .build();

        SocioAbonado socioAbonado2 = SocioAbonado.builder()
                .nombre("Sergio")
                .apellidos("Ramos")
                .email("sergioramos@gmail.com")
                .telefono("987654321")
                .dni("87654321B")
                .asiento("B2")
                .fechaAbono("2021-01-01")
                .build();

        socioAbonadoRepo.save(socioAbonado1);
        socioAbonadoRepo.save(socioAbonado2);

        socioAbonadoRepo.save(socioAbonado1);
        socioAbonadoRepo.save(socioAbonado2);




        System.out.println("Socios insertados: " + socioRepo.count());

        System.out.println(socioRepo.findAll());
        System.out.println(socioAbonadoRepo.findAll());

    }

}