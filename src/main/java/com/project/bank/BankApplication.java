package com.project.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.project.bank.Model.Employee;
import com.project.bank.Service.EmployeeService;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(BankApplication.class, args);
		
		// Employee employee = new Employee("deepak", "deepak@example.com", "password", "123 Main St", "555-1234");
		Employee employee2 = new Employee("GOWTHAM2", "gowtham@example.com2", "password@1232", "123 Main St32", "555-123452");
		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
		System.out.println("Starting employee registration");
		// employeeService.registerEmployee(employee);
		employeeService.registerEmployee(employee2);
		System.out.println("Finished employee registration");
	}

}
