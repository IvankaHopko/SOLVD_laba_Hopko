package com.solvd.laba.block1.OOP;

public class BuildingCrew extends Foreman {
    private int totalExperience;
    private int workingHours;
    public boolean weatherDependence;

    public BuildingCrew(int totalExperience, int workingHours, boolean weatherDependence) {
        this.totalExperience = totalExperience;
        this.workingHours = workingHours;
        this.weatherDependence = weatherDependence;
    }

    @Override
    public void provideServices() {
        System.out.println("We build a new building according to its design");
    }

    public int getTotalExperience() {
        return this.totalExperience;
    }

    public void setTotalExperience(int totalExperience) {
        this.totalExperience = totalExperience;
    }

    public int getWorkingHours() {
        return this.workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public BuildingCrew() {
    }
}