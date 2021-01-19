package com.tts.main.factory;


// this is going to be the class blueprint for our Department objects
public class Department {

    private String name;
    private String manager;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Department(String name, String manager) {
        this.name = name;
        this.manager = manager;
    }
}
