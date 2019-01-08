package com.ionic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ionic.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
