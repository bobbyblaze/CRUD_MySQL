package com.learn.CRUD_MySQL.entity;

import javax.persistence.*;

@Entity
public class Users {
    private Integer id;
    private String login_name;
    private String password;

    public Users() {}

    public Users(Integer id, String login_name, String password){
        this.id = id;
        this.login_name = login_name;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

/**
 * @Entity in JPA is nothing but POJO (Plain old Java object) representing data that can be persisted to the database.
 * An entity represents a table stored in a database. Every instance of an entity represents a row in the table.
 * (Because no @Table annotation exists, it is assumed that this entity is mapped to a table named Users.)
 * @Id is used so that JPA recognizes it as the object’s ID.
 * @GeneratedValue used under @Id indicated that the persistence provider must assign primary keys for the entity
 * using a database identity column
 * Putting annotations on methods (like setters and getters) forces JPA to access properties via methods. It makes
 * sense when internal state of your object differs from the database schema.
 */