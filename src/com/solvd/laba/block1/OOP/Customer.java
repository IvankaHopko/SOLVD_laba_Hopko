package com.solvd.laba.block1.OOP;

public class Customer {
    private String firstName;
    private String lastName;
    public boolean idea;
    public boolean extraMoney;

    public Customer(String firstName, String lastName, boolean idea, boolean extraMoney){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idea = idea;
        this.extraMoney = extraMoney;
    }

    public Customer() {
    }

    public String getFirstName(String firstName){
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(String lastName){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }


}
