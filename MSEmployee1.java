package com.wipro.java.ms.management_system;

public abstract class MSEmployee1 {
    private String name;
    private int id;

    public MSEmployee1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public abstract void displayRole();
}