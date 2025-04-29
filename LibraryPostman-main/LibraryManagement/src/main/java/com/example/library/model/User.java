package com.example.library.model;


import jakarta.persistence.*;


// Este es el modelo del usuario
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;


    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }


    public String getPassword(){

            return password;

    }

    public void setPassword(String passWord_){

            this.password = passWord_;

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

 


}
