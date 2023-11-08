package com.solvd.laba.block1.OOP;

public class ProcurementDept extends EngineeringDept{
  private int staff;
  private double salary;

  public ProcurementDept(int staff, double salary){
    this.staff = staff;
    this.salary = salary;
  }

  public int getStaff(){
    return this.staff;
  }

  public void setStaff(int staff){
    this.staff = staff;
  }

  public double getSalary(){
    return this.salary;
  }

  public void setSalary(double salary){
    this.salary = salary;
  }

  public ProcurementDept(int staff, boolean enoughInfo){
    super(staff, enoughInfo);
  }
  public ProcurementDept(){
  }
}

