package com.desafio.borapracima.repository;

import com.desafio.borapracima.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

    // Métodos de consulta, se necessário
}