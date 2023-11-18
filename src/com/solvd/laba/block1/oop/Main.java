package com.solvd.laba.block1.oop;

import com.solvd.laba.block1.oop.exceptions.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    public static void main(String[] args) {

        Receptionist receptionist = new Receptionist("Ella", "Parenti", 26,
                "Receptionist", 20000, 5);
        Engineer engineer = new Engineer("John", "Bambie", "Senior Engineer",
                40000, 10, false);
        PurchasingManager purchasingManager = new PurchasingManager("Mikaela", "Hanks",
                "Marketer", 25000, 7, 1,
                500000, 200000);

        Foreman foreman1 = new Foreman();
        Foreman foreman2 = new Foreman();
        Foreman[] foremenArray = {foreman1, foreman2};

        BuildingCrew buildingCrew = new BuildingCrew(10, 100, 40,
                12);
        Accountant accountant = new Accountant("Sarah", "Miles", "Junior Accountant",
                18000, 1, true);

        Building desiredBuilding = new Building(2, 70, "suburbs", "townhouse");
        Customer customer = new Customer("Dean", "Winchester", desiredBuilding);
        Supplier supplier = new Supplier("John", "Dogget", "Kyiv", true);

        LOGGER.info("Customer: " + customer.getFirstName() + " " + customer.getLastName() + "\n\n" +
                "Desired building: " + "\n" + customer.getDesiredBuilding());

        int floors = desiredBuilding.getFloors();
        double area = desiredBuilding.getArea();
        int hours = buildingCrew.getWorkingHours();
        String location = desiredBuilding.getLocation();
        String typeOfBuilding = desiredBuilding.getTypeOfBuilding();

        double totalPrice = CostCalculating.totalPriceCalculation(desiredBuilding, buildingCrew);

        LOGGER.info("\nTotal price: " + totalPrice);

        try {
            Engineer.checkingForEnoughInfo(engineer.getEnoughInfo());
        } catch (NotEnoughInfoException e) {
            LOGGER.error(e.getMessage());
        }
    }
}

