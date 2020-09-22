package com.detonadev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.detonadev.course.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
