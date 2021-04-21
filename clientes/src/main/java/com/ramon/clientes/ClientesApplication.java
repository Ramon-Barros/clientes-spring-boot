package com.ramon.clientes;


import com.ramon.clientes.Model.enity.Cliente;
import com.ramon.clientes.Model.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ClientesApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}

}
