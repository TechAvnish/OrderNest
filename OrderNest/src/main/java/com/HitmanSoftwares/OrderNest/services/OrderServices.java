package com.HitmanSoftwares.OrderNest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.HitmanSoftwares.OrderNest.entities.Orders;
import com.HitmanSoftwares.OrderNest.entities.User;
import com.HitmanSoftwares.OrderNest.repositories.OrderRepository;

public class OrderServices {
    @Autowired
    private OrderRepository orderRepository;
    public List<Orders> getOrders()
    {
        List<Orders> list=this.orderRepository.findAll();
        return list;
    }
    public void saveOrder(Orders order)
    {
        this.orderRepository.save(order);
    }

    public void updateOrder(int id,Orders order)
    {
        order.setoId(id);
        this.orderRepository.save(order);

    }

    public void deleteOrder(int id)
    {
        this.orderRepository.deleteById(id);
    }

    public List<Orders> getOrdersForUser(User user)
    {
        return  this.orderRepository.findOrdersByUser(user);
    }
}
