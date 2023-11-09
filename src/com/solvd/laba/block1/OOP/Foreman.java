package com.solvd.laba.block1.OOP;

public class Foreman extends CompanyEmployees {
    private String firstName;
    private String lastName;
    private String occupation;
    private double salary;
    public int experience;
    public boolean readyToStart;

    public Foreman(String firstName, String lastName, String occupation, double salary, int experience,
                   boolean readyToStart) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.salary = salary;
        this.experience = experience;
        this.readyToStart = readyToStart;
    }

    public Foreman() {
    }

    public void checkingForAllNecessaryToStart(){
        if (readyToStart) {
            System.out.println("Ready to start building");
        } else{
            System.out.println("Not ready to start building");
        }
    }

    @Override
    public String toString(){
        return "Foreman{" +
            "experience=" + experience +
            '}';
    }

    @Override
    public void provideServices() {
        System.out.println("I lead the building crew");
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
}

