package com.meuprimeiroprojeto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprimeiroprojeto.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
