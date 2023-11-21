package com.solvd.laba.block1.oop;

import com.solvd.laba.block1.oop.exceptions.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    public static void main(String[] args) throws NotInStockException, NotReadyToStartException {

        ArrayList<CompanyEmployee> employees = new ArrayList<>();

        employees.add(new Receptionist("Ella", "Parenti", 26,
                "Receptionist", 20000, 5));
        employees.add(new Engineer("John", "Bambie", "Senior Engineer",
                40000, 10, false));
        employees.add(new PurchasingManager("Mikaela", "Hanks",
                "Marketer", 25000, 7, 500000, 350000));
        employees.add(new Accountant("Sarah", "Miles", "Junior Accountant",
                18000, 1, true));
        employees.add(new Foreman("Bill", "Moore", "senior foreman", 60000,
                25, true));
        BuildingCrew buildingCrew = new BuildingCrew(10, 100, 40,
                12, 10);
        Building desiredBuilding = new Building(2, 70, "suburbs", "townhouse");
        Customer customer = new Customer("Dean", "Winchester", desiredBuilding);
        Supplier supplier = new Supplier("John", "Dogget", "Kyiv", true);

        LOGGER.info("\n\nCustomer: " + customer.getFirstName() + " " + customer.getLastName() + "\n\n" +
                "Desired building: " + "\n" + customer.getDesiredBuilding());

        double totalPrice = CostCalculating.totalPriceCalculation(desiredBuilding, buildingCrew);

        LOGGER.info("\nTotal price: " + totalPrice);

        Supplier.inStockChecking(supplier.getHaveAllNeeded());
        LOGGER.info("All in stock: " + Supplier.inStockChecking(supplier.getHaveAllNeeded()));

        try {
            double fundsLeft = PurchasingManager.makingAPurchase(employees.get(2).getRequiredCost());
            LOGGER.info("Funds left after purchase: " + fundsLeft);
        } catch (InsufficientFundsException e) {
            LOGGER.error(e.getMessage());
        }

        Foreman.checkingForAllNecessaryToStart(employees.get(4).getReadyToStart());
        LOGGER.info("All preparations are done and we are ready to start: " +
                Foreman.checkingForAllNecessaryToStart(employees.get(4).getReadyToStart()));

        try {
            int finalWorksTime = BuildingCrew.buildingProcess(buildingCrew.getMonthsToBuild());
            LOGGER.info("Time for final works on building: " + finalWorksTime + " months");
        } catch (OutOfTimeException e) {
            LOGGER.error(e.getMessage());
        }

        try {
            Engineer.checkingForEnoughInfo(employees.get(1).getEnoughInfo());
        } catch (NotEnoughInfoException e) {
            LOGGER.error(e.getMessage());
        }
    }
}

