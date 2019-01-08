package com.ionic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ionic.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
