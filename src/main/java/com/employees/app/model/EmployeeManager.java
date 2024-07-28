package com.employees.app.model;

public class EmployeeManager {
    
    public static void add(Employees list) {
        list.addEmployee(new Employee("Frankie", "Albert", 696969, "albertrocks@gmail.com","Ultimate flirter"));
        list.addEmployee(new Employee("Lemon", "Cheating", 123456, "cheatinglemon@gmail.com","A lemon no-one can trust"));
        list.addEmployee(new Employee("Rishav", "Raju", 77779, "iamrich@gmail.com","white dude"));
        list.addEmployee(new Employee("Manjunath", "Nemanu", 7637918, "nemanimanjunath@gmail.com","vegan"));
    }
}
