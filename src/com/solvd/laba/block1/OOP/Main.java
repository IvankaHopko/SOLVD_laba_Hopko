package com.solvd.laba.block1.OOP;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Dean", "Winchester", true, false);
        Receptionist receptionist = new Receptionist("Ella", "Parenti", "Receptionist",
                20000, 5);
        Engineer engineer = new Engineer("John", "Bembi", "Senior Engineer",
                40000, 10, true);
        PurchasingManager purchasingManager = new PurchasingManager("Mikaela", "Hanks",
                "Marketer", 25000, 7);
        BuildingCrew buildingCrew = new BuildingCrew(10, 40, false);
        Accountant accountant = new Accountant("Sarah", "Miles", "Junior Accountant",
                18000, 1, true);
        Foreman foreman = new Foreman("Oleg", "Hopko", "Senior Foreman", 70000,
                20, true);
        Building building = new Building(2);
    }
}