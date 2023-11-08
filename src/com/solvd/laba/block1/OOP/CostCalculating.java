package com.solvd.laba.block1.OOP;

public class CostCalculating {
    private Building building;
    private Foremen foremen;

    public CostCalculating(Building building, Foremen foremen) {
        this.building = building;
        this.foremen = foremen;
    }

    public double calculating() {
        int floors = building.getFloors();
        String type = building.getType();

        double area = Double.parseDouble(building.getArea());

        int staffAmount = foremen.getStaffAmount();

        double costPerMeterSquared = 10000;
        double cost = costPerMeterSquared * floors;

        if (floors == 1) {
            cost = costPerMeterSquared;
        } else if (floors > 1 && floors <= 5) {
            cost = costPerMeterSquared * 1.5;
        } else if (floors > 5 && floors <= 10) {
            cost = costPerMeterSquared * 7;
        } else if (floors > 10) {
            cost = costPerMeterSquared * 15;
        }
        return cost;
    }
}




