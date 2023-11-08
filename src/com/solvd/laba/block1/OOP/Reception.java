package com.solvd.laba.block1.OOP;

public class Reception extends Customer{
public String name;
public String occupation;

public Reception(String name, String occupation){
    this.name = name;
    this.occupation = occupation;
}

public Reception(){
}

    public Reception(String firstName, String lastName, boolean idea, boolean extraMoney){
    super(firstName, lastName, idea, extraMoney);
    }

}
