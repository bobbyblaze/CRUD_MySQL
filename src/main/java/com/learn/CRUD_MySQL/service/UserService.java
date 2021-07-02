package com.learn.CRUD_MySQL.service;

import com.learn.CRUD_MySQL.entity.Users;
import com.learn.CRUD_MySQL.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    // we are telling spring that, while creating and object of Service, first create the object of Repository and
    // assign it to variable "repo" so we can access methods of the Repository
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

/**
 * @Service annotation is used in service layer and annotates classes that perform service tasks, often we don't
 * use it, but in many case you use this annotation to represent a best practice. For example, we could directly
 * call a DAO (Data Access Object) class to persist an object to your database, but this is horrible. It is pretty
 * good to call a service class, that calls a DAO. It's a good thing to perform the separation of concerns pattern.
 * @Transactional annotation itself defines the scope of a single database transaction. The database transaction
 * happens inside the scope of a persistence context. The persistence context is in JPA the EntityManager , implemented
 * internally using an Hibernate Session (when using Hibernate as the persistence provider).
 * @Autowired allows Spring to resolve and inject collaborating beans into our bean (autowires bean on the getter and
 * setter methods).
 */
