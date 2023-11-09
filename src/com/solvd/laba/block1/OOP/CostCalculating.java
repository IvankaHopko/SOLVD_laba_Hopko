package com.solvd.laba.block1.OOP;

public class CostCalculating {
    public Building building;
    public BuildingCrew buildingCrew;

    public CostCalculating(Building building, BuildingCrew buildingCrew) {
        this.building = building;
        this.buildingCrew = buildingCrew;
    }

    public double calculating(Building building) {
        int floors = building.getFloors();
        double costPerMeterSquared = 10000;
        double cost = costPerMeterSquared * floors;

        if (floors == 1) {
            cost = costPerMeterSquared;
        } else if (floors > 1 && floors <= 5) {
            cost = cost + (cost * 0.015);
        } else if (floors > 5 && floors <= 10) {
            cost = cost + (cost * 0.07);
        } else if (floors > 10) {
            cost = cost + (cost * 0.15);
        }
        return cost;
    }

    public double costCalculatingOnWorkingHours(BuildingCrew buildingCrew) {
        int workingHours = buildingCrew.getWorkingHours();
        double costPerHour = 500;
        double cost = costPerHour * workingHours;

        if (workingHours == 40) {
            cost = costPerHour;
        } else if (workingHours > 40 && workingHours < 50) {
            cost = cost + (cost * 0.10);
        } else if (workingHours >= 50) {
            cost = cost + (cost * 0.20);
        }
        return cost;
    }
}






