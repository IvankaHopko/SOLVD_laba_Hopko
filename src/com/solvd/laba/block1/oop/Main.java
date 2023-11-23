package com.solvd.laba.block1.oop;

import com.solvd.laba.block1.oop.exceptions.*;
import com.solvd.laba.block1.oop.mapsAndCollections.BuildingLinkedList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    public static void main(String[] args) throws NotInStockException, NotReadyToStartException {

        ArrayList<CompanyEmployee> employees = new ArrayList<>();

        employees.add(new Receptionist("Ella", "Parenti", 26, "Receptionist",
                20000, 5));
        employees.add(new Engineer("John", "Bambie", "Senior Engineer", 40000,
                10, false));
        employees.add(new PurchasingManager("Mikaela", "Hanks", "Marketer", 25000,
                7, 500000, 350000));
        employees.add(new Accountant("Sarah", "Miles", "Junior Accountant", 18000,
                1, true));
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

        BuildingLinkedList<Building> buildings = new BuildingLinkedList<>();

        buildings.add(new Building(3, 220, "in woods", "villa"));
        buildings.add(new Building(9, 500, "downtown", "block of flats"));
        buildings.add(new Building(2, 90, "suburbs", "cottage"));
        buildings.add(new Building(1, 40, "suburbs", "eco-house"));

        for (int i = 0; i < buildings.size(); i++) {
            LOGGER.info(buildings.get(i));
            LOGGER.info("\n");
        }

        Building buildingToRemove = new Building(2, 90, "suburbs", "cottage");
        boolean removed = buildings.remove(buildingToRemove);

        if (removed) {
            LOGGER.info("\nBuilding has been removed successfully");
        } else {
            LOGGER.info("\nBuilding not found or can not be removed");
        }

        LOGGER.info("\nBuildings after removing:" + "\n");
        for (int i = 0; i < buildings.size(); i++) {
            LOGGER.info(buildings.get(i));
        }

        Set<Foreman> foremanHashSet = new HashSet<>();

        foremanHashSet.add(new Foreman("Bill", "Moore", "Lead foreman", 40000, 25, true));
        foremanHashSet.add(new Foreman("Chris", "Jackson", "Senior foreman", 25000, 17, true));
        foremanHashSet.add(new Foreman("Denis", "Broom", "Foreman", 20000, 6, true));
        foremanHashSet.add(new Foreman("Neal", "Gates", "Junior foreman", 16000, 2, true));

        LOGGER.info("Foremen details: ");
        for (Foreman foreman : foremanHashSet) {
            LOGGER.info("Experience: " + foreman.getExperience() + ", " + "Last Name: " + foreman.getLastName());
        }

        Set<Foreman> foremanLinkedHashSet = new LinkedHashSet<>();

        foremanLinkedHashSet.add(new Foreman("Steve", "Hook", "Lead foreman", 40000, 19, true));
        foremanLinkedHashSet.add(new Foreman("Joe", "Miles", "Senior foreman", 25000, 15, true));
        foremanLinkedHashSet.add(new Foreman("Luke", "Drake", "Foreman", 20000, 9, true));
        foremanLinkedHashSet.add(new Foreman("Sam", "Novak", "Junior foreman", 16000, 3, true));

        LOGGER.info("\nForemen details: ");
        for (Foreman foreman : foremanLinkedHashSet) {
            LOGGER.info("Experience: " + foreman.getExperience() + ", " + "Last Name: " + foreman.getLastName());
        }

        Set<Foreman> foremanTreeSet = new TreeSet<>(Comparator.comparingInt(Foreman::getExperience));

        foremanTreeSet.add(new Foreman("Jim", "Stain", "Lead foreman", 40000, 26, true));
        foremanTreeSet.add(new Foreman("Mike", "Anderson", "Senior foreman", 25000, 15, true));
        foremanTreeSet.add(new Foreman("Will", "Middleton", "Foreman", 20000, 7, true));
        foremanTreeSet.add(new Foreman("Bobby", "Ringo", "Junior foreman", 16000, 1, true));

        LOGGER.info("\nForemen details: ");
        for (Foreman foreman : foremanTreeSet) {
            LOGGER.info("Experience: " + foreman.getExperience() + ", " + "Last Name: " + foreman.getLastName());
        }
    }
}

