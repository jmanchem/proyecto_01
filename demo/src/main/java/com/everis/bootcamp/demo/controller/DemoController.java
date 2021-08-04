package com.everis.bootcamp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.bootcamp.demo.model.DatosPersonales;
import com.everis.bootcamp.demo.service.DemoService;

import jdk.internal.org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/bootcamp")
public class DemoController {
	
	@Autowired
	DemoService service;
	
	@GetMapping("/saludo")
	public Mono<String> getSaludo(){
		return Mono.just("! Hola mundo!");
	}
	
	@GetMapping("/nombreCompleto")
	public Mono<String> getNombreCompleto(@RequestParam String Nombre,
										  @RequestParam String Apellido){
		Log.info("nombreXD: "+ Nombre);
		Log.info("apellidoXD: "+ Apellido);
		DatosPersonales datos = new DatosPersonales(Nombre,Apellido);
		return service.getFullSaludo(datos);
	}
}
