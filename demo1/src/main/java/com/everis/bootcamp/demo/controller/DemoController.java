package com.everis.bootcamp.demo.controller;

import com.everis.bootcamp.demo.model.DatosPersonales;
import com.everis.bootcamp.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/nombrecompleto")
    public Mono<String> getNombreCompleto(@RequestParam String nombre, @RequestParam String apellido){
        DatosPersonales datos = new DatosPersonales(nombre, apellido);
        return service.getFullSaludo(datos);
    }

}
