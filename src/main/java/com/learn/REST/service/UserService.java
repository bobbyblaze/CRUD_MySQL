package com.learn.REST.service;

import com.learn.REST.entity.Users;
import com.learn.REST.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository repo;

    public List<Users> listAll() {
        return repo.findAll();
    }

    public void save(Users users) {
        repo.save(users);
    }

    public Users get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
