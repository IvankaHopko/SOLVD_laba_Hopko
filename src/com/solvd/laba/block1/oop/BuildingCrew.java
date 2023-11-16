package com.solvd.laba.block1.oop;

import com.solvd.laba.block1.oop.interfaces.IUpgradeQualification;

public class BuildingCrew implements IUpgradeQualification {
    private int totalExperience;
    private double minCostPerHour;
    private int workingHours;

    public BuildingCrew(int totalExperience, double minCostPerHour, int workingHours) {
        this.totalExperience = totalExperience;
        this.minCostPerHour = minCostPerHour;
        this.workingHours = workingHours;
    }

    public BuildingCrew() {
    }

    public int getTotalExperience() {
        return this.totalExperience;
    }

    public void setTotalExperience(int totalExperience) {
        this.totalExperience = totalExperience;
    }

    public double getMinCostPerHour() {
        return this.minCostPerHour;
    }

    public void setMinCostPerHour(double minCostPerHour) {
        this.minCostPerHour = minCostPerHour;
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