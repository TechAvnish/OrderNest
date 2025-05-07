package com.HitmanSoftwares.OrderNest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.HitmanSoftwares.OrderNest.entities.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer>
{
    public Admin findByAdminEmail(String email);
}
