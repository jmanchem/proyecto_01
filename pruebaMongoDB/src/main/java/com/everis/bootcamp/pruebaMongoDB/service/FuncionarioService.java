package com.everis.bootcamp.pruebaMongoDB.service;

import com.everis.bootcamp.pruebaMongoDB.model.Funcionario;

import java.util.List;

public interface FuncionarioService {
    public List<Funcionario> obtenerTodos();
    public Funcionario obtenerPorCodigo(String codigo);
    public Funcionario criarIndexado(Funcionario funcionario);
    public Funcionario criar(Funcionario funcionario);
    public List<Funcionario> obtenerFuncionariosPorIdade(Integer de, Integer ate);
    public List<Funcionario> obtenerFuncionariosPorNome(String nome);
}
