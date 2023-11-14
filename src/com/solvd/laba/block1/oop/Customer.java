package com.solvd.laba.block1.oop;

import java.util.Objects;

public class Customer implements IPayWhenWorkIsDone, IApproveDesign {
    private String firstName;
    private String lastName;
    private Building desiredBuilding;

    public Customer(String firstName, String lastName, Building desiredBuilding) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.desiredBuilding = desiredBuilding;
    }

    public Customer() {
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

    public Building getDesiredBuilding() {
        return this.desiredBuilding;
    }

    public void setDesiredBuilding(Building desiredBuilding) {
        this.desiredBuilding = desiredBuilding;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer that = (Customer) o;
        return desiredBuilding == that.desiredBuilding &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName);
    }

    @Override
    public String toString() {
        return "desiredBuilding{" +
                "floors='" + getDesiredBuilding() +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public final void providesIdea() {
        System.out.println("I have an idea about the building. And I want your company to help me");
    }

    @Override
    public void doneWorkPayment() {
        System.out.println("I pay money for the work that is done");
    }

    @Override
    public void designApproval() {
        System.out.println("I approve design if it is done according to my idea");
    }

    public void showCustomerOrderDetails(Customer customer) {
        System.out.println("Customer: " + customer.getFirstName() + customer.getLastName() +
                customer.getDesiredBuilding());
    }
}
