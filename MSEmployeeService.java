package com.wipro.java.ms.management_system;

import java.util.List;

public class MSEmployeeService {
    public void displayEmployeeRoles(List<MSEmployee1> employees) {
        for (MSEmployee1 employee : employees) {
            employee.displayRole();
        }
    }
}