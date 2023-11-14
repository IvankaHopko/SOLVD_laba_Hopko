package com.solvd.laba.block1.oop;

import java.math.BigDecimal;

public class CostCalculating {

    public double costCalculationOnFloors(Building building) {
        int floors = building.getFloors();
        double costPerFloor = 10000;
        double cost = (costPerFloor * floors);

        if (floors == 1) {
            cost = costPerFloor;
        } else if (floors > 1 && floors <= 5) {
            cost = costPerFloor + (costPerFloor * 0.015);
        } else if (floors > 5 && floors <= 10) {
            cost = costPerFloor + (costPerFloor * 0.07);
        } else if (floors > 10) {
            cost = costPerFloor + (costPerFloor * 0.15);
        }
        return cost;
    }

    public static double costCalculationOnMeterSquared(Building building) {
        double area = building.getArea();
        double costPerMeterSquared = 1600;
        double cost = costPerMeterSquared * area;

        if (area == 35) {
            cost = costPerMeterSquared;
        } else if (area > 35 && area <= 60) {
            cost = costPerMeterSquared + (costPerMeterSquared * 0.1);
        } else if (area > 60 && area <= 100) {
            cost = costPerMeterSquared + (costPerMeterSquared * 0.25);
        } else if (area > 100 && area <= 200) {
            cost = costPerMeterSquared + (costPerMeterSquared * 0.5);
        }
        return cost;
    }

    public static double costCalculationOnWorkingHours(BuildingCrew buildingCrew) {
        double workingHours = buildingCrew.getWorkingHours();
        double costPerHour = 120;
        double cost = costPerHour * workingHours;

        if (workingHours == 40) {
            cost = costPerHour;
        } else if (workingHours > 40 && workingHours <= 45) {
            cost = costPerHour + (costPerHour * 0.15);
        } else if (workingHours > 45 && workingHours <= 50) {
            cost = costPerHour + (costPerHour * 0.3);
        }
        return cost;
    }

    public static double costCalculationOnLocation(Building building) {
        String location = building.getLocation();
        double regularCost = 700000;
        double cost = 0;

        if (location.equals("suburbs")) {
            cost = regularCost + (regularCost * 0.15);
        } else if (location.equals("downtown")) {
            cost = regularCost + (regularCost * 0.25);
        } else {
            System.out.println("It is necessary to discuss the dependence of the price");
        }
        return cost;
    }

    public static double costCalculationOnBuildingType(Building building) {
        String typeOfBuilding = building.getTypeOfBuilding();
        double regularCost = 700000;
        double cost = 0;

        if (typeOfBuilding.equals("townhouse")) {
            cost = regularCost + (regularCost * 0.1);
        } else if (typeOfBuilding.equals("cottage") || typeOfBuilding.equals("eco-house")) {
            cost = regularCost + (regularCost * 0.15);
        } else if (typeOfBuilding.equals("block of flats")) {
            cost = regularCost + (regularCost * 0.25);
        } else if (typeOfBuilding.equals("villa")) {
            cost = regularCost + (regularCost * 0.35);
        } else {
            System.out.println("It is necessary to discuss the dependence of the price");
        }
        return cost;
    }
}









