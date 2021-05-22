package com.ramon.clientes.Model.repository;

import java.util.List;

import com.ramon.clientes.Model.enity.ServicoPrestado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ServicoPrestadoRepository extends JpaRepository<ServicoPrestado, Integer >{

    @Query(" select s from  ServicoPrestado s join s.cliente c where upper(c.nome) like upper(:nome) and MONTH(s.date) =:mes")
    List<ServicoPrestado> findByNomeClienteAndMes(@Param("nome") String nome, @Param("mes") Integer mes);
    
}
