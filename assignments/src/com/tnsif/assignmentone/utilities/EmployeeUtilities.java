package com.tnsif.assignmentone.utilities;

import com.tnsif.assignmentone.employees.Employee;

public class EmployeeUtilities {

    public void increaseSalary(Employee emp, double percentage) {
        double newSalary = emp.getSalary() + (emp.getSalary() * (percentage / 100));
        emp.setSalary(newSalary);
        System.out.println("Salary updated successfully!");
    }

    public void displayEmployee(Employee emp) {
        emp.displayInfo();
        System.out.println("----------------------------------");
    }
}
