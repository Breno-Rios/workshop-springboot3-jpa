package com.rios.course.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rios.course.entities.OrderItem;
import com.rios.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
