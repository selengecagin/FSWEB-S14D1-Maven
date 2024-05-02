package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public String work() {
        setSalary(getSalary() + 500);
        return "JuniorDeveloper starts to working";
    }
}
