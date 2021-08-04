package com.everis.bootcamp.demo.service;


import com.everis.bootcamp.demo.model.DatosPersonales;
import reactor.core.publisher.Mono;

public interface DemoService {

    public Mono<String> getFullSaludo(DatosPersonales datos);

}
