package com.solvd.laba.block1.OOP;

import java.util.Objects;

public class Accountant extends CompanyEmployees {
    private String firstName;
    private String lastName;
    private String occupation;
    protected double salary;
    protected int experience;
    private boolean enoughMoney;

    protected Accountant(String firstName, String lastName, String occupation, double salary,
                         int experience, boolean enoughMoney) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.salary = salary;
        this.experience = experience;
        this.enoughMoney = enoughMoney;
    }

    public Accountant() {
    }

    public double paysSalary(Receptionist receptionist) {
        return receptionist.getSalary();
    }

    public double paysSalary(Engineer engineer) {
        return engineer.getSalary();
    }
    public double paysSalary(Foreman foreman) {
        return foreman.getSalary();
    }

    public void checkingForEnoughMoney(){
        if (enoughMoney) {
            System.out.println("There is enough money to pay the purchase invoice");
        }else{
            System.out.println("Not enough money");
        }
    }

    @Override
    public void provideServices() {
        System.out.println("I pay salary to building staff and I pay for the purchases of materials");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Accountant)) return false;
        Accountant that = (Accountant) o;
        return Objects.equals(firstName, that.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName);
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

    public boolean getEnoughMoney() {
        return this.enoughMoney;
    }

    public void setEnoughMoney(boolean enoughMoney) {
        this.enoughMoney = enoughMoney;
    }
}

