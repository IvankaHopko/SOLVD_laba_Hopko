package com.solvd.laba.block1.OOP;

public class Supplier extends ProcurementDept{
    private String address;
    private String name;
    public boolean haveAllNeeded;

    public Supplier(String address, String name, boolean haveAllNeeded) {
        this.address = address;
        this.name = name;
        this.haveAllNeeded = haveAllNeeded;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Supplier(){
    }
    public Supplier(int staff, double salary){
        super(staff, salary);
    }

}
