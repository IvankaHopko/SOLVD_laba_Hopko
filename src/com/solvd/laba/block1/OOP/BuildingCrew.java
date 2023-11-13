package com.solvd.laba.block1.OOP;

public class BuildingCrew extends Foreman implements IUpgradeQualification {
    private int totalExperience;
    private int workingHours;
    public boolean weatherDependence;

    public BuildingCrew(int totalExperience, int workingHours, boolean weatherDependence) {
        this.totalExperience = totalExperience;
        this.workingHours = workingHours;
        this.weatherDependence = weatherDependence;
    }

    public BuildingCrew() {
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

    public void buildingWork() {
        System.out.println("We provide building services according to engineered plan");
    }

    @Override
    public void provideServices() {
        System.out.println("We build a new building according to its design");
    }

    @Override
    public void qualificationUpgrading() {
        System.out.println("We regularly have trainings to upgrade our qualification");
    }
}