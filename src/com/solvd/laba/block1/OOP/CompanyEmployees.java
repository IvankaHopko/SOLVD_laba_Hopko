package com.solvd.laba.block1.OOP;

import java.util.Objects;

public abstract class CompanyEmployees {
    private String firstName;
    private String lastName;
    protected String occupation;
    private double salary;
    private int experience;

public CompanyEmployees(String firstName, String lastName, String occupation, double salary, int experience){
    this.firstName = firstName;
    this.lastName = lastName;
    this.occupation = occupation;
    this.salary = salary;
    this.experience = experience;
}

public CompanyEmployees(){
}

@Override
public boolean equals(Object o){
 if (this == o) return true;
 if (o == null || getClass() != o.getClass()) return false;
 CompanyEmployees that = (CompanyEmployees) o;
 return Double.compare(that.salary, salary) == 0 &&
         experience == that.experience &&
         Objects.equals(firstName, that.firstName) &&
         Objects.equals(lastName, that.lastName);
}

@Override
public int hashCode(){
    return Objects.hash(firstName, lastName, salary, experience);
}

protected abstract void provideServices();

    public String getFirstName(){
        return this.firstName;
}

    public void setFirstName(String firstName){
        this.firstName = firstName;
}

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getOccupation(){
        return this.occupation;
    }

    public void setOccupation(String occupation){
        this.occupation = occupation;
    }

    public void acceptsCustomerRequest(){
    };

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public int getExperience(){
        return this.experience;
    }

    public void setExperience(int experience){
        this.experience = experience;
    }
}

