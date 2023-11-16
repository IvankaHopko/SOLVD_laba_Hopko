package com.solvd.laba.block1.oop;

import com.solvd.laba.block1.oop.interfaces.IProvideServices;
import com.solvd.laba.block1.oop.interfaces.IUpgradeQualification;

public class Engineer extends CompanyEmployee implements IProvideServices, IUpgradeQualification {
    private String firstName;
    private String lastName;
    private String occupation;
    private double salary;
    public int experience;
    public boolean enoughInfo;

    public Engineer(String firstName, String lastName, String occupation, double salary, int experience,
                    boolean enoughInfo) {
        super(firstName, lastName, occupation, salary, experience);
        this.enoughInfo = enoughInfo;
    }

    public Engineer() {
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

    @Override
    public String toString() {
        return "Engineer{" +
                "salary=" + salary +
                '}';
    }

    public void checkingForEnoughInfo() {
        if (enoughInfo) {
            System.out.println("Ready to start designing");
        } else {
            System.out.println("Not enough information");
        }
    }

    @Override
    public void provideServices() {
        System.out.println("I create a design for a new project");
    }

    public void passesDesignToProcurementDept() {
        System.out.println("Check for the needed materials according to provided design");
    }

    @Override
    public void qualificationUpgrading() {
        System.out.println("I regularly upgrade my knowledge and skills in engineering");
    }
}

