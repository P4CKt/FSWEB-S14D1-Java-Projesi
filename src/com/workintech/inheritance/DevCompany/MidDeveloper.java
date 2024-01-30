package com.workintech.inheritance.DevCompany;

public class MidDeveloper extends Employee{
    @Override
    public void work() {
        System.out.println("MidDeveloper");
        setSalary(getSalary()*30/100);
    }

    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }
}
