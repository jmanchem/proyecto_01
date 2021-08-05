package com.everis.bootcamp.pruebaMongoDB.service.impl;

import com.everis.bootcamp.pruebaMongoDB.model.Funcionario;
import com.everis.bootcamp.pruebaMongoDB.repository.FuncionarioRepository;
import com.everis.bootcamp.pruebaMongoDB.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //DEnotar como un servicio
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired// Inyectar el repositorio
    private FuncionarioRepository funcionarioRepository;

    @Override //Spring data con datos no relacionales
    public List<Funcionario> obtenerTodos() {
        //Metemos todos los datos de la coleccion que acabamos de crear Funcionario
        return this.funcionarioRepository.findAll();
    }

    @Override
    public Funcionario obtenerPorCodigo(String codigo) {
        return this.funcionarioRepository
                .findById(codigo)
                .orElseThrow(()-> new IllegalArgumentException("Funcionario no existe"));
    }

    @Override
    public Funcionario criar(Funcionario funcionario) {
        return this.funcionarioRepository.save(funcionario);
    }
}
