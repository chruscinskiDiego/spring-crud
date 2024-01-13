package com.diegochruscinski.spring_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegochruscinski.spring_project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
