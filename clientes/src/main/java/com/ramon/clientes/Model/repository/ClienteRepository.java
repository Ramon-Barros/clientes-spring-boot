package com.ramon.clientes.Model.repository;

import com.ramon.clientes.Model.enity.cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<cliente,Integer>{
    
}
