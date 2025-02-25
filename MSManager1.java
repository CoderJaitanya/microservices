package com.wipro.java.ms.management_system;

public class MSManager1 extends MSEmployee1 {
    public MSManager1(String name, int id) {
        super(name, id);
    }

    @Override
    public void displayRole() {
        System.out.println(getName() + " is a Manager.");
    }
}