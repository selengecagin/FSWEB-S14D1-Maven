package com.workintech.developers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public String work() {
        setSalary(getSalary() + 5000);
        return "Senior developer starts to working";
    }
}
