package com.meuprimeiroprojeto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprimeiroprojeto.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
