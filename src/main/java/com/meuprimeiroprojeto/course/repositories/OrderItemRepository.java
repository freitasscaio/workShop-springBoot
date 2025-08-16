package com.meuprimeiroprojeto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprimeiroprojeto.course.entities.OrderItem;
import com.meuprimeiroprojeto.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
