package com.solvd.laba.block1.OOP;

public class PurchasingManager extends CompanyEmployees
        implements IProvideServices, IMaintainDocumentation, IApproveBuildingMaterials {
    private String firstName;
    private String lastName;
    private String occupation;
    private double salary;
    public int experience;

    public PurchasingManager(String firstName, String lastName, String occupation, double salary, int experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.salary = salary;
        this.experience = experience;
    }

    public PurchasingManager() {
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
    public void provideServices() {
        System.out.println("I communicate with supplier and purchase the needed materials");
    }

    @Override
    public void documentMaintenance() {
        System.out.println("I maintain documentation about purchases");
    }

    @Override
    public void buildingMaterialsApproval() {
        System.out.println("I give my approval about building materials");
    }

    public void communication() {
        System.out.println("I communicate with suppliers about the quality of needed materials");
    }
}

