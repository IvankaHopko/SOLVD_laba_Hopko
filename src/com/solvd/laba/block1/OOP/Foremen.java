package com.solvd.laba.block1.OOP;

public class Foremen extends Supplier{
    public int staffAmount;
    private double salary;
    private int buildTime;
    public boolean readyToStart;

    public Foremen(int staffAmount, double salary, int buildTime, boolean readyToStart){
        this.staffAmount = staffAmount;
        this.salary = salary;
        this.buildTime = buildTime;
        this.readyToStart = readyToStart;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public int getBuildTime(){
        return buildTime;
    }

    public void setBuildTime(int buildTime){
        this.buildTime = buildTime;
    }

   public Foremen(){
   }

   public Foremen(String address, String name, boolean haveAllNeeded){
        super(address, name, haveAllNeeded);
   }
}
