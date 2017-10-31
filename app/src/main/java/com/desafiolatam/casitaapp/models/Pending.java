package com.desafiolatam.casitaapp.models;

/**
 * Created by Samuel on 27-10-2017.
 */

public class Pending {

    private String name, description, key;
    public Pending() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
