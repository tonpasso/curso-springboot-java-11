package com.detonadev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.detonadev.course.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
