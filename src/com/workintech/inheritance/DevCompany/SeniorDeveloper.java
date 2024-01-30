package com.workintech.inheritance.DevCompany;

public class SeniorDeveloper extends Employee{
    @Override
    public void work() {
        System.out.println("MidDeveloper");
        setSalary(getSalary()*60/100);
    }

    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }
}
