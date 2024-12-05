package com.example.demo.Model;

public class Salle {
    int idSalle;
    int capacite;
    String typeSalle;
    public Salle(){
        this.idSalle = 0;
        this.capacite = 0;
        this.typeSalle = "";
    }
    public Salle(int idSalle, int capacite, String typeSalle) {
        this.idSalle = idSalle;
        this.capacite = capacite;
        this.typeSalle = typeSalle;
    }

    public int getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(int idSalle) {
        this.idSalle = idSalle;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public String getTypeSalle() {
        return typeSalle;
    }

    public void setTypeSalle(String typeSalle) {
        this.typeSalle = typeSalle;
    }
}
