package com.thiago.employeemanager.model.Entities;

import com.thiago.employeemanager.model.enums.EmployeeType;

public abstract class Employee {

    protected String name;
    protected  String role;
    protected  Integer nationalID;
    protected  EmployeeType employeeType;

    public Employee(String name, String role, Integer nationalID, EmployeeType employeeType) {
        this.name = name;
        this.role = role;
        this.nationalID = nationalID;
        this.employeeType = employeeType;
    }

    public Double calculateSalary(){
        return 0.0;
    }
}
