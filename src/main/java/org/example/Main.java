package org.example;
import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        execute();
    }
    public static void execute() {
        // Create Healthplan
        Healthplan basicPlan = new Healthplan(1, "Standard Health", Plan.BASIC);

        // Create Employee
        Employee employee = new Employee(1, "John Doe", "john@example.com", "password123", new String[3]);
        employee.addHealthPlan(0, basicPlan.getName());

        // Create Company
        Company company = new Company(1, "TechCorp", 5463873.5, new String[5]);
        company.addEmployee(0, employee.getFullName());

        // Print objects
        System.out.println(basicPlan);
        System.out.println(employee);
        System.out.println(company);
    }
}
