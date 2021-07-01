package com.learn.REST.controller;

import com.learn.REST.entity.Users;
import com.learn.REST.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/users")
    public List<Users> list(){
        return service.listAll();
    }

    // get
    @GetMapping("/users/{id}")
    public ResponseEntity<Users> get(@PathVariable Integer id) {
        try {
            Users users = service.get(id);
            return new ResponseEntity<Users>(users, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Users>(HttpStatus.NOT_FOUND);
        }
    }

    // create
    @PostMapping("/users")
    public void add(@RequestBody Users users) { //we use @RequestBody to automatically serialize Json obj to Java obj
        service.save(users);
    }

    // update
    @PutMapping("/users/{id}")
    public ResponseEntity<?> update(@RequestBody Users users, @PathVariable Integer id) {
        try {
            Users userExists = service.get(id);
            service.save(users);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // delete
    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
