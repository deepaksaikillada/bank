package com.project.bank.Model;

import lombok.Data;

@Data
public class Customer {
    private int customerSSNNo;
    private String customerName;
    private String email;
    private String address;
    private String contactNumber;
    private String aadharNumber;
    private String panNumber;
    private String accountNumber;

    public Customer() {
    }

    public Customer(int customerSSNNo, String customerName, String email, String address, String contactNumber, String aadharNumber, String panNumber, String accountNumber) {
        this.customerSSNNo = customerSSNNo;
        this.customerName = customerName;
        this.email = email;
        this.address = address;
        this.contactNumber = contactNumber;
        this.aadharNumber = aadharNumber;
        this.panNumber = panNumber;
        this.accountNumber = accountNumber;
    }

    public int getCustomerSSNNo() {
        return customerSSNNo;
    }

    public void setCustomerSSNNo(int customerSSNNo) {
        this.customerSSNNo = customerSSNNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
