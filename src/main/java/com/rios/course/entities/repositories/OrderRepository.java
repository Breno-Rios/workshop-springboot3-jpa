package com.rios.course.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rios.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
