package com.HitmanSoftwares.OrderNest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HitmanSoftwares.OrderNest.entities.Orders;
import com.HitmanSoftwares.OrderNest.entities.User;

public interface OrderRepository extends JpaRepository<Orders, Integer>
{
    List<Orders> findOrdersByUser(User user);
}
