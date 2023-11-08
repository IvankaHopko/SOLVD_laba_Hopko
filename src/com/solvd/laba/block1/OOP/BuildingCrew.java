package com.solvd.laba.block1.OOP;

public class BuildingCrew extends Foremen{
    private int totalExperience;
    private int workingHours;
    public boolean weatherDependence;

    public BuildingCrew(int totalExperience, int workingHours, boolean weatherDependence){
        this.totalExperience = totalExperience;
        this.workingHours = workingHours;
        this.weatherDependence = weatherDependence;
    }

    public int getTotalExperience(){
        return this.totalExperience;
    }

    public void setTotalExperience(int totalExperience){
        this.totalExperience = totalExperience;
    }

    public int getWorkingHours(){
        return this.workingHours;
    }

    public void setWorkingHours(int workingHours){
        this.workingHours = workingHours;
    }

    public BuildingCrew(){
    }

    public BuildingCrew(int staffAmount, double salary, int buildTime, boolean readyToStart){
        super(staffAmount, salary, buildTime, readyToStart);
    }
}
