package com.meuprimeiroprojeto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprimeiroprojeto.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
