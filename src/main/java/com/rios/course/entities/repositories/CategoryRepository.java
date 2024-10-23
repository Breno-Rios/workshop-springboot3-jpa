package com.rios.course.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rios.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
