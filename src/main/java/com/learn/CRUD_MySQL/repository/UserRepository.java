package com.learn.CRUD_MySQL.repository;

import com.learn.CRUD_MySQL.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
}

/**
 * Declares an interface extending JpaRepository sets it to the domain class, that it will handle.
 */