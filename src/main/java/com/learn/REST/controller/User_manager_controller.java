package com.learn.REST.controller;

import com.learn.REST.model.user_manager;
import com.learn.REST.repository.user_manager_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class User_manager_controller {

    @Autowired
    user_manager_repository u_m_r;

    @RequestMapping(value="/user_manager")
    public List<user_manager> getAll(){
        return u_m_r.findAll();
    }

}