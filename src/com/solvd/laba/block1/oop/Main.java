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

        BuildingLinkedList buildingList = new BuildingLinkedList();

        buildingList.add(new Building(3, 220, "in woods", "villa"));
        buildingList.add(new Building(9, 500, "downtown", "block of flats"));
        buildingList.add(new Building(2, 90, "suburbs", "cottage"));
        buildingList.add(new Building(1, 40, "suburbs", "eco-house"));

        for (int i = 0; i < buildingList.size(); i++) {
            LOGGER.info(buildingList.get(i));
            LOGGER.info("\n");
        }

        Building buildingToRemove = new Building(2, 90, "suburbs", "cottage");
        boolean removed = buildingList.remove(buildingToRemove);

        if (removed) {
            LOGGER.info("\nBuilding has been removed successfully");
        } else {
            LOGGER.info("\nBuilding not found or can not be removed");
        }

        LOGGER.info("\nBuildings after removing:" + "\n");
        for (int i = 0; i < buildingList.size(); i++) {
            LOGGER.info(buildingList.get(i));
        }

        HashSet<Foreman.Foremen<String>> foremenHashSet = new HashSet<>();
        Foreman.Foremen<String> foreman1 = new Foreman.Foremen<>("Moore", 25);
        Foreman.Foremen<String> foreman2 = new Foreman.Foremen<>("Jackson", 17);
        Foreman.Foremen<String> foreman3 = new Foreman.Foremen<>("Broom", 6);
        Foreman.Foremen<String> foreman4 = new Foreman.Foremen<>("Gates", 2);

        foremenHashSet.add(foreman1);
        foremenHashSet.add(foreman2);
        foremenHashSet.add(foreman3);
        foremenHashSet.add(foreman4);

        LOGGER.info("Foremen details: ");
        for (Foreman.Foremen<String> details : foremenHashSet) {
            LOGGER.info(details);
        }

        LinkedHashSet<Foreman.Foremen<String>> foremenLinkedHashSet = new LinkedHashSet<>();
        Foreman.Foremen<String> crewLeader1 = new Foreman.Foremen<>("Moore", 25);
        Foreman.Foremen<String> crewLeader2 = new Foreman.Foremen<>("Jackson", 17);
        Foreman.Foremen<String> crewLeader3 = new Foreman.Foremen<>("Broom", 6);
        Foreman.Foremen<String> crewLeader4 = new Foreman.Foremen<>("Gates", 2);

        foremenLinkedHashSet.add(crewLeader1);
        foremenLinkedHashSet.add(crewLeader2);
        foremenLinkedHashSet.add(crewLeader3);
        foremenLinkedHashSet.add(crewLeader4);

        LOGGER.info("\nForemen details: ");
        for (Foreman.Foremen<String> details : foremenLinkedHashSet) {
            LOGGER.info(details);
        }

        TreeSet<Foreman.Foremen<String>> foremenTreeSet = new TreeSet<>(Comparator.comparingInt(Foreman.Foremen::hashCode));
        Foreman.Foremen<String> seniorWorker1 = new Foreman.Foremen<>("Moore", 25);
        Foreman.Foremen<String> seniorWorker2 = new Foreman.Foremen<>("Jackson", 17);
        Foreman.Foremen<String> seniorWorker3 = new Foreman.Foremen<>("Broom", 6);
        Foreman.Foremen<String> seniorWorker4 = new Foreman.Foremen<>("Gates", 2);

        foremenTreeSet.add(seniorWorker1);
        foremenTreeSet.add(seniorWorker2);
        foremenTreeSet.add(seniorWorker3);
        foremenTreeSet.add(seniorWorker4);

        LOGGER.info("\nForemen details: ");
        for (Foreman.Foremen<String> details : foremenTreeSet) {
            LOGGER.info(details);
        }
    }
}

