package com.everis.bootcamp.demo.service.implementation;

import com.everis.bootcamp.demo.model.DatosPersonales;
import com.everis.bootcamp.demo.service.DemoService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class DemoServiceImple implements DemoService {

    @Override
    public Mono<String> getFullSaludo(DatosPersonales datos) {
        String saludo  = "Hola programador de microservicios: " + datos.getNombre() + " " + datos.getApellido();
        return Mono.just(saludo);
    }
}
