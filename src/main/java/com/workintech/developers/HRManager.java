package com.workintech.developers;

public class HRManager extends Employee{
private String[] JuniorDeveloper;
private String[] MidDeveloper;
private String[] SeniorDeveloper;


    public HRManager(long id, String name, double salary, String[] juniorDeveloper, String[] midDeveloper, String[] seniorDeveloper) {
        super(id, name, salary);
        JuniorDeveloper = juniorDeveloper;
        MidDeveloper = midDeveloper;
        SeniorDeveloper = seniorDeveloper;
    }

    public void addEmployee(String[] JuniorDeveloper){

    }







    @Override
    public String work() {
        setSalary(getSalary() + 1000);
        return "HR Manager starts to working";
    }




}
