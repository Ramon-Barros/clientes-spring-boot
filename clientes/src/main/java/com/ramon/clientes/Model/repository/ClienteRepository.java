package com.ramon.clientes.Model.repository;

import com.ramon.clientes.Model.enity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>{
    
}
