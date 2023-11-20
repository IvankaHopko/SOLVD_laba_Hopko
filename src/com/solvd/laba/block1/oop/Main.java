package com.solvd.laba.block1.oop;

import com.solvd.laba.block1.oop.exceptions.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    public static void main(String[] args) throws NotInStockException, NotReadyToStartException {

        Receptionist receptionist = new Receptionist("Ella", "Parenti", 26,
                "Receptionist", 20000, 5);
        Engineer engineer = new Engineer("John", "Bambie", "Senior Engineer",
                40000, 10, false);
        PurchasingManager purchasingManager = new PurchasingManager("Mikaela", "Hanks",
                "Marketer", 25000, 7, 500000, 350000);

        BuildingCrew buildingCrew = new BuildingCrew(10, 100, 40,
                12, 10);
        Accountant accountant = new Accountant("Sarah", "Miles", "Junior Accountant",
                18000, 1, true);
        Foreman foreman = new Foreman("Bill", "Moore", "senior foreman", 60000,
                25, true);

        Building desiredBuilding = new Building(2, 70, "suburbs", "townhouse");
        Customer customer = new Customer("Dean", "Winchester", desiredBuilding);
        Supplier supplier = new Supplier("John", "Dogget", "Kyiv", true);

        LOGGER.info("Customer: " + customer.getFirstName() + " " + customer.getLastName() + "\n\n" +
                "Desired building: " + "\n" + customer.getDesiredBuilding());

        double totalPrice = CostCalculating.totalPriceCalculation(desiredBuilding, buildingCrew);

        LOGGER.info("\nTotal price: " + totalPrice);

        Supplier.inStockChecking(supplier.getHaveAllNeeded());
        LOGGER.info("All in stock: " + Supplier.inStockChecking(supplier.getHaveAllNeeded()));

        try {
            double fundsLeft = PurchasingManager.makingAPurchase(purchasingManager.getRequiredCost());
            LOGGER.info("Funds left after purchase: " + fundsLeft);
        } catch (InsufficientFundsException e) {
            LOGGER.error(e.getMessage());
        }

        Foreman.checkingForAllNecessaryToStart(foreman.getReadyToStart());
        LOGGER.info("All preparations are done and we are ready to start: " +
                Foreman.checkingForAllNecessaryToStart(foreman.getReadyToStart()));

        try {
            int finalWorksTime = BuildingCrew.buildingProcess(buildingCrew.getMonthsToBuild());
            LOGGER.info("Time for final works on building: " + finalWorksTime + " months");
        } catch (OutOfTimeException e) {
            LOGGER.error(e.getMessage());
        }

        try {
            Engineer.checkingForEnoughInfo(engineer.getEnoughInfo());
        } catch (NotEnoughInfoException e) {
            LOGGER.error(e.getMessage());
        }
    }
}

