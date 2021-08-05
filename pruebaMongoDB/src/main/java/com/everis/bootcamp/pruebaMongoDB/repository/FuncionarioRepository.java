package com.everis.bootcamp.pruebaMongoDB.repository;

import com.everis.bootcamp.pruebaMongoDB.model.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FuncionarioRepository extends MongoRepository<Funcionario,String> {

}
