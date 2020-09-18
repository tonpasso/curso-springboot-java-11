package com.detonadev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.detonadev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
