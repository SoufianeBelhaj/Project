package com.example.demo.Model;

public class Departement {
    int id;
    String nomd;
    public Departement(){
        this.id = 0;
        this.nomd = "";
    }
    public Departement(int id, String nomd) {
        this.id = id;
        this.nomd = nomd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomd() {
        return nomd;
    }

    public void setNomd(String nomd) {
        this.nomd = nomd;
    }
}
