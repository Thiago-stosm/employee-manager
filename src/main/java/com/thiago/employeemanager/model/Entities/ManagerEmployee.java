package com.thiago.employeemanager.model.Entities;

import com.thiago.employeemanager.model.enums.EmployeeType;

public class ManagerEmployee extends Employee {

    public ManagerEmployee(String name, String role, Integer nationalID, EmployeeType employeeType) {
        super(name, role, nationalID, employeeType);
    }

    @Override
    public Double calculateSalary() {
        return super.calculateSalary();
    }
}
