package com.everis.bootcamp.proyecto1.controller;

import com.everis.bootcamp.proyecto1.model.DatosPersonales;
import com.everis.bootcamp.proyecto1.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bootcamp")
public class DemoController {

    @Autowired
    DemoService service;

    @GetMapping("/saludo")
    public Mono<String> getSaludo(){
        return  Mono.just("¡Hola Mundo!");
    }

    @GetMapping("/nombrecompleto1")
    public Mono<String> getNombreCompleto(@RequestParam String nombre, @RequestParam String apellido){
        DatosPersonales datos = new DatosPersonales(nombre, apellido);
        return service.getFullSaludo(datos);
    }

}
