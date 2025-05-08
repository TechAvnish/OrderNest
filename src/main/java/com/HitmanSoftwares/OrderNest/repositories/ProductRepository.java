package com.HitmanSoftwares.OrderNest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.HitmanSoftwares.OrderNest.entities.Product;

public interface ProductRepository extends CrudRepository<Product,Integer>
{
    public Product findByPname(String name);

}
