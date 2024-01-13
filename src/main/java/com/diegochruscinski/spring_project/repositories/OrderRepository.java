package com.diegochruscinski.spring_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegochruscinski.spring_project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
