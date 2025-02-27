package com.wipro.java.ms.management_system;

public class MSSecurityGuard extends MSEmployee1 {
    public MSSecurityGuard(String name, int id) {
        super(name, id);
    }

    @Override
    public void displayRole() {
        System.out.println(getName() + " is a Security Guard.");
    }
}