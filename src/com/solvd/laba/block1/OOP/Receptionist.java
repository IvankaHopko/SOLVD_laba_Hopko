package com.solvd.laba.block1.OOP;

public class Receptionist extends CompanyEmployees {
    private String firstName;
    private String lastName;
    private String occupation;
    private double salary;
    private int experience;

    public Receptionist(String firstName, String lastName, String occupation, double salary, int experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.salary = salary;
        this.experience = experience;
    }

    @Override
    public String toString(){
        return "Receptionist{" +
                "experience=" + experience +
                '}';
    }

    public Receptionist() {
    }

    @Override
    public void provideServices() {
        System.out.println("I help customer to define the idea");
    }

    public void passesCustomerRequest() {
        System.out.println("I have a new project for you to design");
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return this.occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return this.experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}



