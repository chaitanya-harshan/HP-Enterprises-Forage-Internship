package com.employees.app;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employees.app.model.Employee;
import com.employees.app.model.Employees;

@RestController
public class controller {

    static Employees list = new Employees();
    // EmployeeManager.add(list);

    @GetMapping("/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        // return new Employee(
        //     "Isaac",
        //     "Albert",
        //     696969,
        //     "albertrocks@gmail.com",
        //     "Ultimate Dauym chanter!"
        // );
        Employee person = list.getEmployee(employeeId);
        if (person != null) return person;
        else return null;
    }

    @GetMapping("/employees")
    public ArrayList<Employee> getEmployees() {
        return list.getEmployeesList();
    }

    @PostMapping("/post")
    public String postUser(@RequestBody Employee employee) {
        list.addEmployee(employee);
        return employee.getFirstName() + " has been Successfully Uploaded.";
    }   
}

