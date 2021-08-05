package com.everis.bootcamp.pruebaMongoDB.controller;

import com.everis.bootcamp.pruebaMongoDB.model.Funcionario;
import com.everis.bootcamp.pruebaMongoDB.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")

public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public List<Funcionario> obtenerTodos(){
        return this.funcionarioService.obtenerTodos();
    }
    @GetMapping("/{codigo}")
    public Funcionario obtenerPorCodigo(@PathVariable String Codigo){
        return this.funcionarioService.obtenerPorCodigo(Codigo);
    }
    @PostMapping
    public Funcionario Criar(@RequestBody Funcionario funcionario){
        return this.funcionarioService.criar(funcionario);
    }
}
