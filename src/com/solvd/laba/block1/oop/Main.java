package com.solvd.laba.block1.oop;

public class Main {
    public double totalPrice;

    public static void main(String[] args) {

        Receptionist receptionist = new Receptionist("Ella", "Parenti", 26,
                "Receptionist", 20000, 5);
        Engineer engineer = new Engineer("John", "Bambie", "Senior Engineer",
                40000, 10, true);
        PurchasingManager purchasingManager = new PurchasingManager("Mikaela", "Hanks",
                "Marketer", 25000, 7, 1, 500000);

        Foreman foreman1 = new Foreman();
        Foreman foreman2 = new Foreman();
        Foreman[] foremenArray = {foreman1, foreman2};

        BuildingCrew buildingCrew = new BuildingCrew(10, 100, 40);
        Accountant accountant = new Accountant("Sarah", "Miles", "Junior Accountant",
                18000, 1, true);

        Building desiredBuilding = new Building(2, 70, "suburbs", "townhouse");
        Customer customer = new Customer("Dean", "Winchester", desiredBuilding);

        CostCalculating costCalculating = new CostCalculating();

        System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName() + "\n\n" +
                "Desired building: " + "\n" + customer.getDesiredBuilding());

        int floors = desiredBuilding.getFloors();
        double area = desiredBuilding.getArea();
        String location = desiredBuilding.getLocation();
        String typeOfBuilding = desiredBuilding.getTypeOfBuilding();

        double costCalculationOnFloors = costCalculating.costCalculationOnFloors(desiredBuilding);
        double costCalculationOnMeterSquared = costCalculating.costCalculationOnMeterSquared(desiredBuilding);
        double costCalculationOnLocation = costCalculating.costCalculationOnLocation(desiredBuilding);
        double costCalculationOnBuildingType = costCalculating.costCalculationOnBuildingType(desiredBuilding);
        double costCalcutationOnWorkingHours = costCalculating.costCalculationOnWorkingHours(buildingCrew);

        double totalPrice = costCalculationOnFloors + costCalculationOnMeterSquared + costCalculationOnLocation +
                costCalculationOnBuildingType + costCalcutationOnWorkingHours;
        System.out.println("\n" + "Total price: " + totalPrice);
    }
}

