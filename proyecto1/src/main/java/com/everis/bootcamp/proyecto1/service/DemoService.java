package com.everis.bootcamp.proyecto1.service;


import com.everis.bootcamp.proyecto1.model.DatosPersonales;
import reactor.core.publisher.Mono;

public interface DemoService {

    public Mono<String> getFullSaludo(DatosPersonales datos);

}
