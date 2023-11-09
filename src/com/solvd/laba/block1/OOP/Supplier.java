package com.solvd.laba.block1.OOP;

public abstract class Supplier {
    private String firstName;
    private String lastName;
    private String address;
    protected boolean haveAllNeeded;

    public Supplier(String firstName, String lastName, String address, boolean haveAllNeeded) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.haveAllNeeded = haveAllNeeded;
    }

    public Supplier() {
    }

    protected void sellsNeededMaterial(){
        if (haveAllNeeded){
            System.out.println("Your order is fully complected");
    } else {
            System.out.println("Not enough items in store");
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean getHaveAllNeeded() {
        return this.haveAllNeeded;
    }

    public void setHaveAllNeeded(boolean haveAllNeeded) {
        this.haveAllNeeded = haveAllNeeded;
    }
}
