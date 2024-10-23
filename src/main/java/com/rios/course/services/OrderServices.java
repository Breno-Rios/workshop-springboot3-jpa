package com.rios.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rios.course.entities.Order;
import com.rios.course.entities.repositories.OrderRepository;

@Service
public class OrderServices {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {

		return repository.findAll();

	}

	public Order findById(Long id) {
		
		Optional<Order> obj = repository.findById(id);

		return obj.get();

	}

}
