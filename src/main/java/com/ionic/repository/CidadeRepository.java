package com.ionic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ionic.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
