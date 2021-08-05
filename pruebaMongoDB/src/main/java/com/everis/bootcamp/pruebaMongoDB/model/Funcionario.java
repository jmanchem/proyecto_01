package com.everis.bootcamp.pruebaMongoDB.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.*;

import java.math.BigDecimal;

@Data
@Document //Se le puede poner otro nombre
public class Funcionario {

    @Id //Propiedade
    private String codigo;

    private String name;

    private Integer idade;

    private BigDecimal salario;

    @DBRef //Referencia de una coleccion dentro de otro
    private Funcionario chefe;
}
