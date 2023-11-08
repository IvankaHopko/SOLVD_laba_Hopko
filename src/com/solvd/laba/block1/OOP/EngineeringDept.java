package com.solvd.laba.block1.OOP;

public class EngineeringDept extends Reception {
    public int staff;
    public boolean enoughInfo;


    public EngineeringDept(int staff, boolean enoughInfo) {
        this.staff = staff;
        this.enoughInfo = enoughInfo;
    }

    public EngineeringDept() {
    }

    public EngineeringDept(String name, String occupation) {
        super(name, occupation);
    }
}

