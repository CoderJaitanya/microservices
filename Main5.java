package com.wipro.java.ms.emp;

public class Main5 {
	public static void main(String[] args) {
        Employee emp = new Employee("Jaitanya", 1, 80000);
        
        EmployeePrinter printer = new EmployeePrinter();
        printer.printEmployeeDetails(emp);
        
        SalaryCalculator calculator = new SalaryCalculator();
        System.out.println("Annual Salary: " + calculator.calculateAnnualSalary(emp));
        
        EmployeePersistence persistence = new EmployeePersistence();
        persistence.saveToFile(emp, "employee.txt");
    }
}
