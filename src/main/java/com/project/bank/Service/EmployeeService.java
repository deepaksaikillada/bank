package com.project.bank.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bank.DataBase.EmployeeDB;
import com.project.bank.Model.Employee;

@Service
public class EmployeeService {
    List<Employee> employees = new ArrayList<>();
    // EmployeeDB db = new EmployeeDB();

    @Autowired
    EmployeeDB db;
    public void registerEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee registered successfully: " + employee.getEmployeeName());
        //want to save the employee to the database using EmployeeDB
        db.save(employee);
    }

}
