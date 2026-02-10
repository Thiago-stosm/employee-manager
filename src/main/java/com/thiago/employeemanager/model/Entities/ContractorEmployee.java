package com.thiago.employeemanager.model.Entities;

import com.thiago.employeemanager.model.enums.EmployeeType;

public class ContractorEmployee extends Employee {

    protected ContractorEmployee(Builder builder){
        super(builder);
    }

    public static class Builder
            extends Employee.Builder<Builder>{

        @Override
        protected Builder self() {
            return null;
        }

        @Override
        public Employee build() {
            return null;
        }
    }

    @Override
    public Double calculateSalary() {
        return super.calculateSalary();
    }
}
