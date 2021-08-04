package com.everis.bootcamp.demo.impl;

import org.springframework.stereotype.Service;

import com.everis.bootcamp.demo.model.DatosPersonales;
import com.everis.bootcamp.demo.service.DemoService;
import reactor.core.publisher.Mono;

@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public Mono<String> getFullSaludo(DatosPersonales datos) {
		String saludo = "Hola programador de microservicios: "+ datos.getNombre() + " " + datos.getApellido();
		return Mono.just(saludo);
	}

}
