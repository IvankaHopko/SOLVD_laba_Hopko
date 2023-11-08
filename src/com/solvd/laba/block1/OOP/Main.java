package com.solvd.laba.block1.OOP;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Dean", "Winchester", true, false);
        Reception reception = new Reception("Ella", "Administrator");
        EngineeringDept engineeringDept = new EngineeringDept(10, true);
        ProcurementDept procurementDept = new ProcurementDept(8, 15000);
        Supplier supplier = new Supplier("Kyiv", "BuildInvest", true);
        Foremen foremen = new Foremen(50, 50000, 12, true);
        BuildingCrew buildingCrew = new BuildingCrew(10, 40, false);
        IndependentAccounting independentAccounting = new IndependentAccounting("SaveYourMoney", "Chernivtsi",
                5, 12, true);
        Building building = new Building("OfficeBuilding", 3, "Downtown");
        CostCalculating costCalculating = new CostCalculating(building, foremen);

        double calculating = costCalculating.calculating();
        System.out.println("Total construction cost: " + calculating + "$");
    }
}
