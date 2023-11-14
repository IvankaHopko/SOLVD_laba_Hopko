package com.solvd.laba.block1.oop;

public class Foreman extends CompanyEmployee
        implements IProvideServices, IApproveBuildingMaterials, IApproveDesign, IUpgradeQualification {
    private String firstName;
    private String lastName;
    private String occupation;
    private double salary;
    public int experience;
    public boolean readyToStart;

    public Foreman(String firstName, String lastName, String occupation, double salary, int experience,
                   boolean readyToStart) {
       super(firstName, lastName, occupation, salary, experience);
        this.readyToStart = readyToStart;
    }

    public Foreman() {
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
        return "Foreman{" +
                "experience=" + experience +
                '}';
    }

    public void checkingForAllNecessaryToStart() {
        if (readyToStart) {
            System.out.println("Ready to start building");
        } else {
            System.out.println("Not ready to start building");
        }
    }

    @Override
    public void provideServices() {
        System.out.println("I lead the building crew");
    }

    @Override
    public void buildingMaterialsApproval() {
        System.out.println("I give my approval about building materials");
    }

    public final void crewLeading() {
        System.out.println("I lead the building crew during our work");
    }

    @Override
    public void designApproval() {
        System.out.println("I give my approval about the project design");
    }

    @Override
    public void qualificationUpgrading() {
        System.out.println("I constantly upgrade my knowledge in building and team managing");
    }
}

