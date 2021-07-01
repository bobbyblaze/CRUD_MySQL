package com.learn.REST.repository;

import com.learn.REST.entity.users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface user_repository extends JpaRepository<users, Integer> {
}
