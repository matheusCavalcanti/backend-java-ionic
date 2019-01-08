package com.ionic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ionic.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
