package com.HitmanSoftwares.OrderNest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.HitmanSoftwares.OrderNest.entities.Admin;
import com.HitmanSoftwares.OrderNest.entities.User;

public interface UserRepository extends CrudRepository<User,Integer>
{
    public User findUserByUemail(String email);
}
