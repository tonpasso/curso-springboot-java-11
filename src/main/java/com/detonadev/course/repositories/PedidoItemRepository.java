package com.detonadev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.detonadev.course.entities.PedidoItem;

public interface PedidoItemRepository extends JpaRepository<PedidoItem, Long> {

}
