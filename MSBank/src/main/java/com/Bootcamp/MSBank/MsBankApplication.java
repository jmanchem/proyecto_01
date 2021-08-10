package com.Bootcamp.MSBank;

import com.Bootcamp.MSBank.model.Usuario;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

import java.util.Locale;


@Slf4j
@SpringBootApplication
public class MsBankApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(MsBankApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Flux<String> nombres = Flux.just("Andres Guzman","Pedro Filano","Maria Fulana","Diego Sultano",
						"Juan Mengano", "Bruce lee","Bruce Willis");
		Flux<Usuario> usuarios =nombres.map(nombre-> new Usuario(nombre.split(" ")[0].toUpperCase(),
						nombre.split(" ")[1].toUpperCase()))
				.filter(usuario-> usuario.getNombre().toLowerCase().equals("bruce"))
				.doOnNext(usuario-> {
					if(usuario == null){
						throw  new RuntimeException("Nombres no pueden estar vaciios");
					}System.out.println(usuario.getNombre().concat(" ").concat(usuario.getApellido()));
				})
				.map(usuario->{
					String nombre = usuario.getNombre().toLowerCase(Locale.ROOT);
					usuario.setNombre(nombre);
					return usuario;
				});
		usuarios.subscribe(e -> log.info(e.toString()), error -> log.error(error.getMessage()),
				new Runnable() {
					@Override
					public void run() {
						log.info("HA finalizado la ejecucion del observable con exito");
					}
				});
	}
}
