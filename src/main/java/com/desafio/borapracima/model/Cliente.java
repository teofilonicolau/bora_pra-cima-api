package com.desafio.borapracima.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clientes")
public class Cliente {

    @Id
    private String id;
    private String cpf;
    private String nome;
    private Integer idade;

    // getters e setters
}