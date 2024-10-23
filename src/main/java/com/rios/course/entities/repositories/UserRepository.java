package com.rios.course.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rios.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
