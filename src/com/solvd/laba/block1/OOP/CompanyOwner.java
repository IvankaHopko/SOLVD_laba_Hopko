package com.solvd.laba.block1.OOP;

public final class CompanyOwner {
    final String firstName = "Chandler";
    final String lastName = "Bing";
    public boolean soleOwnership;

    static {
        System.out.println("CompanyOwner class is being initialized");
    }

    public CompanyOwner(boolean soleOwnership) {
        this.soleOwnership = soleOwnership;
    }

    public void runsTheCompany() {
        if (soleOwnership) {
            System.out.println("You can make any decision concerning the building company");
        } else {
            System.out.println("You need to consult with a lawyer");
        }
    }
}
