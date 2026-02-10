package com.thiago.employeemanager.model.enums;

import com.thiago.employeemanager.model.Entities.Employee;

public enum EmployeeType {
    FULLTIME ("Full-time"),
    MANAGER ("Manager"),
    CONTRACTOR ("Contractor ");

    private String value;

    EmployeeType(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
