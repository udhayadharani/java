package com.package2;

public class Student {
    private String name;
    private String department;
    private String emailId;
    private int phoneNumber;


    Student(String _name, String _department, String _emailId, int _phoneNumber) {
        this.name = _name;
        this.department = _department;
        this.emailId = _emailId;
        this.phoneNumber = _phoneNumber;



    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
