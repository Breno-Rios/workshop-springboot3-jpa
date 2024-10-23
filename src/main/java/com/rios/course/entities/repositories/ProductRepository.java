package com.rios.course.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rios.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
