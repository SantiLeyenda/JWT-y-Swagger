package com.example.library.dto;


// esto es lo que deberia de recibir el usuario al todo funcionar 


public class LoginResponse {
    private String token;
    private String type;

    public LoginResponse() {
    }

    public LoginResponse(String token, String type) {
        this.token = token;
        this.type = type;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}