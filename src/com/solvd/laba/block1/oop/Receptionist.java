package com.solvd.laba.block1.oop;

public class Receptionist extends CompanyEmployee implements IProvideServices, IMaintainDocumentation {
    private String firstName;
    private String lastName;
    private String occupation;
    private double salary;
    private int experience;
    private int age;

    public Receptionist(String firstName, String lastName, int age, String occupation, double salary, int experience) {
        super(firstName, lastName, occupation, salary, experience);
        this.age = age;
    }

    public Receptionist() {
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

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
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

    @Override
    public String toString() {
        return "Receptionist{" +
                "experience=" + experience +
                '}';
    }

    @Override
    public void provideServices() {
        System.out.println("I help customer to define the idea");
    }

    public void passesCustomerRequest() {
        System.out.println("I have a new project for you to design");
    }

    @Override
    public void documentMaintenance() {
        System.out.println("I maintain general company's documentation");
    }
}



