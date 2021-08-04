package com.everis.bootcamp.demo.service;

import org.springframework.stereotype.Service;
import com.everis.bootcamp.demo.model.DatosPersonales;
import reactor.core.publisher.Mono;

@Service
public interface DemoService {
	public Mono<String> getFullSaludo(DatosPersonales datos);
}
