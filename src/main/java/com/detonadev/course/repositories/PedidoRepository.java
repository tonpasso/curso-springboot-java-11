package com.detonadev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.detonadev.course.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
