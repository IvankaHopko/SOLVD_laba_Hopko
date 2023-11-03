package com.solvd.laba.block1.task3;

public class House extends BuildingCompany{
    private String address;
    public int rooms;
    public int size;
    public int buildTime;
    public int cost;

    public House(String address, int rooms, int size, int buildTime, int cost) {
        this.address = address;
        this.rooms = rooms;
        this.size = size;
        this.buildTime = buildTime;
        this.cost = cost;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
}
