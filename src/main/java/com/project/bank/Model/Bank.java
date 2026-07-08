package com.project.bank.Model;

import lombok.Data;

@Data
public class Bank {
    private int bankId;
    private String bankName;
    private String address;
    private String bankcode;

    public Bank() {
    }

    public Bank(int bankId, String bankName, String address, String bankcode) {
        this.bankId = bankId;
        this.bankName = bankName;
        this.address = address;
        this.bankcode = bankcode;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBankcode() {
        return bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }
}
