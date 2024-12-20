package com.rios.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rios.course.entities.Category;
import com.rios.course.entities.repositories.CategoryRepository;

@Service
public class CategoryServices {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {

		return repository.findAll();

	}

	public Category findById(Long id) {
		
		Optional<Category> obj = repository.findById(id);

		return obj.get();

	}

}
