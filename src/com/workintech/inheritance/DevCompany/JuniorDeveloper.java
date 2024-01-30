package com.workintech.inheritance.DevCompany;

public class JuniorDeveloper extends Employee{
    @Override
    public void work() {
        System.out.println("JuniorDeveloper");
        setSalary(getSalary()*10/100);
    }
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }
}
