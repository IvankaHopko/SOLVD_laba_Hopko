package com.solvd.laba.block1.OOP;

public class IndependentAccounting extends ProcurementDept{
    public String name;
    private String address;
    private int experience;
    private int staff;
    private boolean enoughMoney;

    public IndependentAccounting(String name, String address, int experience, int staff, boolean enoughMoney){
        this.name = name;
        this.address = address;
        this.experience = experience;
        this.staff = staff;
        this.enoughMoney = enoughMoney;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public int getExperience(){
        return this.experience;
    }

    public void setExperience(int experience){
        this.experience = experience;
    }

    public int getStaff(){
        return this.staff;
    }

    public void setStaff(int staff){
        this.staff = staff;
    }

    public boolean getEnoughMoney(){
        return this.enoughMoney;
    }

    public void setEnoughMoney(boolean enoughMoney){
        this.enoughMoney = enoughMoney;
    }

    public IndependentAccounting(){
    }

    public IndependentAccounting(int staff, double salary){
        super(staff, salary);
    }
}
