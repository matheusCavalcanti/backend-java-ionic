package com.ionic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ionic.model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

}
