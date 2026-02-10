package com.thiago.employeemanager.model.Entities;

import com.thiago.employeemanager.model.enums.EmployeeType;

public abstract class Employee {

    protected String name;
    protected String role;
    protected Integer nationalID;
    protected EmployeeType employeeType;

    protected Employee(Builder<?> builder) {
        this.name = builder.name;
        this.role = builder.role;
        this.nationalID = builder.nationalID;
        this.employeeType = builder.employeeType;
    }



    public Double calculateSalary(){
        return 0.0;
    }

    public static abstract class Builder <T extends Builder <T>>{

        private String name;
        private String role;
        private Integer nationalID;
        private EmployeeType employeeType;

        public T name(String name) {
            this.name = name;
            return self();
        }

        public T role(String role) {
            this.role = role;
            return self();
        }

        public T nationalID(Integer nationalID) {
            this.nationalID = nationalID;
            return self();
        }

        public T employeeType(EmployeeType employeeType) {
            this.employeeType = employeeType;
            return self();
        }

        protected abstract T self();

        public abstract Employee build();
    }
}
