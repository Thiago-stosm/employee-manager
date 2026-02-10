package com.thiago.employeemanager.model.Entities;

import com.thiago.employeemanager.model.enums.EmployeeType;

public class FullTimeEmployee extends Employee {

    private FullTimeEmployee(Builder builder){
        super(builder);
    }

    public static class Builder
            extends Employee.Builder<Builder>{

        @Override
        protected Builder self(){
            return this;
        }

        @Override
        public FullTimeEmployee build(){
            return new FullTimeEmployee(this);
        }
    }

    @Override
    public Double calculateSalary() {
        return super.calculateSalary();
    }
}
