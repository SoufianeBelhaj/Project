package com.example.demo.Model;

public class Authentification {
    int id;
    String email;
    String mdp;
    String role;
    public Authentification() {
        this.id = 0;
        this.email = "";
        this.mdp = "";
        this.role = "";

    }
    public Authentification(int id, String email, String mdp, String role) {
        this.id = id;
        this.email = email;
        this.mdp = mdp;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
