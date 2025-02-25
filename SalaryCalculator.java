package com.wipro.java.ms.emp;

public class SalaryCalculator {
	public double calculateAnnualSalary(Employee employee) {
        return employee.getSalary() * 12;
	}
}
