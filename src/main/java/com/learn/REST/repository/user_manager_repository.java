package com.learn.REST.repository;

import com.learn.REST.model.user_manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface user_manager_repository extends JpaRepository<user_manager, Integer> {
}
