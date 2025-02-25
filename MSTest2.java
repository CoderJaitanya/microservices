package com.wipro.java.ms.management_system;

import java.util.ArrayList;
import java.util.List;

public class MSTest2 {
    public static void main(String[] args) {
        List<MSEmployee1> employees = new ArrayList<>();
        employees.add(new MSManager1("Jaitanya", 101));
        employees.add(new MSDeveloper1("Ashish", 102));
        employees.add(new MSSecurityGuard("Smarth", 103));

        MSEmployeeService employeeService = new MSEmployeeService();
        employeeService.displayEmployeeRoles(employees);
    }
}
