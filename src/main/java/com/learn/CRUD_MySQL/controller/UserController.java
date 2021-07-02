package com.learn.CRUD_MySQL.controller;

import com.learn.CRUD_MySQL.entity.Users;
import com.learn.CRUD_MySQL.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController // defines the type of controller we will use
public class UserController {

    // injection of service class
    @Autowired
    private UserService service;

    // get - full data list
    @GetMapping("/users")
    public List<Users> list(){
        return service.listAll();
    }

    // get one entity based on their id
    @GetMapping("/users/{id}")
    public ResponseEntity<Users> get(@PathVariable Integer id) {
        try {
            Users users = service.get(id);
            return new ResponseEntity<Users>(users, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Users>(HttpStatus.NOT_FOUND);
        }
    }

    // create - new data entry
    @PostMapping("/users")
    public void add(@RequestBody Users users) { //we use @RequestBody to automatically serialize Json obj to Java obj
        service.save(users);
    }

    // update - based on id
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

    // delete - delete data based on id
    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}

/**
 * @RestController is a specialized version of the controller. It includes the @Controller and @ResponseBody
 * annotations, and as a result, simplifies the controller implementation. We don't have to user @ResponseBody
 * annotation, because it @RestController enables automatic serialization of the return object into the HttpResponse,
 * by default.
 * @Autowired allows Spring to resolve and inject collaborating beans into our bean (autowires bean on the getter and
 * setter methods).
 * @GetMapping annotated methods handle the HTTP GET requests matched with given URI expression.
 * @PostMapping annotated methods handle the HTTP POST requests matched with given URI expression.
 * @PutMapping(“/{id}”) annotated methods handle the HTTP PUT requests matched with given URI expression. We need to add
 * Path Variable, which contains id, to determine which data should be updated.
 * @DeleteMapping(“/{id}”) annotated methods handle the HTTP DELETE requests matched with given URI expression. We need
 * to add Path Variable, which contains id, to determine which data should be deleted.
 */
