package com.solvd.laba.block1.OOP;

import java.util.Objects;

public class Customer implements IPayWhenWorkIsDone, IApproveDesign {
    private String firstName;
    private String lastName;
    public boolean idea;
    public boolean extraMoney;


    public Customer(String firstName, String lastName, boolean idea, boolean extraMoney) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idea = idea;
        this.extraMoney = extraMoney;
    }

    public Customer() {
    }

    public String getFirstName(String firstName) {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(String lastName) {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer that = (Customer) o;
        return idea == that.idea &&
                extraMoney == that.extraMoney &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, idea, extraMoney);
    }

    public void providesIdea() {
        System.out.println("I have an idea about the building. And I want your company to help me");
    }

    public void paysExtraMoney() {
        if (idea == true) {
            System.out.println("Customer has not to pay extra money");
        } else if (idea == false) {
            System.out.println("Customer has to pay extra money");
        }
    }

    @Override
    public void doneWorkPayment() {
        System.out.println("I pay money for the work that is done");
    }

    @Override
    public void designApproval() {
        System.out.println("I approve design if it is done according to my idea");
    }
}
