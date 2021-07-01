package com.learn.REST.controller;

import com.learn.REST.entity.users;
import com.learn.REST.repository.user_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class User_controller {

    @Autowired
    user_repository u_m_r;

    @RequestMapping(value="/users")
    public List<users> getAll(){
        return u_m_r.findAll();
    }
}
