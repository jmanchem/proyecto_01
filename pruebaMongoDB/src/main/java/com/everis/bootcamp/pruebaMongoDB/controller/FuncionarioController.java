package com.everis.bootcamp.pruebaMongoDB.controller;

import com.everis.bootcamp.pruebaMongoDB.model.Funcionario;
import com.everis.bootcamp.pruebaMongoDB.service.FuncionarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
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
    public Funcionario obtenerPorCodigo(@PathVariable String codigo){
        return this.funcionarioService.obtenerPorCodigo(codigo);
    }
    @PostMapping
    public Funcionario CriarIndexado(@RequestBody Funcionario funcionario){
        return this.funcionarioService.criarIndexado(funcionario);
    }
    @GetMapping("/criar")
    public Funcionario Criar(@RequestBody Funcionario funcionario){
        log.info("funcionario entrante: "+ funcionario);
        return this.funcionarioService.criar(funcionario);
    }
}
