package com.employees.app.model;

import java.util.ArrayList;

public class Employees {
    ArrayList<Employee> employeeList = new ArrayList<>();

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    public boolean exists(int id) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeId() == id) return true;
        }
        return false;
    }

    public Employee getEmployee(int id) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeId() == id) return employee;
        }
        return null;
    }

    public ArrayList<Employee> getEmployeesList() {
        return employeeList;
    }
}
