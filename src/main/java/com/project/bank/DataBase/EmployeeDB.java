package com.project.bank.DataBase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bank.Model.Employee;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.SQLException;

// import com.project.bank.Model.Employee;

@Repository
public interface EmployeeDB extends JpaRepository<Employee, Integer>{
    


    // Connection conn = null;

    // public EmployeeDB() {
    //     try {
    //         conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bank_server", "postgres", "Kdsai@2003");
    //     } catch (SQLException e) {
    //         // TODO Auto-generated catch block
    //         e.printStackTrace();
    //         throw new RuntimeException("Failed to connect to the database", e);
    //     }
    // }

    // public void save(Employee employee) {
    //     String query = "INSERT INTO employee (employeeId, employeeName, email, password, address, contactNumber) VALUES (?, ?, ?, ? , ?, ?)";
    //     try {
    //         PreparedStatement pstmt = conn.prepareStatement(query);
    //         pstmt.setInt(1, employee.getEmployeeId());
    //         pstmt.setString(2, employee.getEmployeeName());
    //         pstmt.setString(3, employee.getEmail());
    //         pstmt.setString(4, employee.getPassword());
    //         pstmt.setString(5, employee.getAddress());
    //         pstmt.setString(6, employee.getContactNumber());
    //         pstmt.executeUpdate();
    //     } catch (SQLException e) {
    //         // TODO Auto-generated catch block
    //         e.printStackTrace();
    //         throw new RuntimeException("Failed to save employee", e);
    //     }
        
    // }
    
}
