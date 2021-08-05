package com.everis.bootcamp.pruebaMongoDB.repository;

import com.everis.bootcamp.pruebaMongoDB.model.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface FuncionarioRepository extends MongoRepository<Funcionario,String> {

    @Query("{$and:[ { 'idade': { $gte: ?0} }, {'idade': { $lte:?1 } }  ]}")
    public List<Funcionario> obtenerFuncionariosPorIdade(Integer de, Integer ate);

    /*@Query("{$and:[ { 'idade': { $gte: ?0} }, {'idade': { $lte:?1 } }  ]}")
    public List<Funcionario> obtenerFuncionariosPorName(String nome);*/

    public List<Funcionario>  findFuncionarioByName(String nome);
}
