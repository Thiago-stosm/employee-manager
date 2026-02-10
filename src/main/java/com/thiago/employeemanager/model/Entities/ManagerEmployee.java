package com.thiago.employeemanager.model.Entities;

import com.thiago.employeemanager.model.enums.EmployeeType;

public class ManagerEmployee
        extends Employee {

    private ManagerEmployee(Builder builder){
        super(builder);
    }

    public static class Builder
            extends Employee.Builder<Builder>{

        @Override
        protected Builder self(){
            return this;
        }

        @Override
        public ManagerEmployee build(){
            return new ManagerEmployee(this);
        }
    }

    @Override
    public Double calculateSalary() {
        return super.calculateSalary();
    }
}
