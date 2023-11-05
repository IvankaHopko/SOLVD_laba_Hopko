package com.solvd.laba.block1.OOP;

class BuildingCompany {
    private String name;
    private String address;
    public int experience;

    public BuildingCompany(String name, String address, int experience) {
        this.name = name;
        this.address = address;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}


