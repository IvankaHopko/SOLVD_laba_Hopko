package com.solvd.laba.block1.OOP;

public class Building {
    private String type;
    private int floors;
    private String area;

    public Building(String type, int floors, String area){
        this.type = type;
        this.floors = floors;
        this.area = area;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public int getFloors(){
        return this.floors;
    }

    public void setFloors(int floors){
        this.floors = floors;
    }

    public String getArea(){
        return this.area;
    }

    public void setArea(String area){
        this.area = area;
    }

    public Building(){
    }
}
