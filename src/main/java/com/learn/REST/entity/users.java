package com.learn.REST.entity;

import javax.persistence.*;

@Entity
public class users {

    @Id
    @GeneratedValue

    @Column(name="id")
    private int id;

    @Column(name="login_name")
    private String login_name;

    @Column(name="password")
    private String password;

    public users(){

    }

    public int getId() {
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
