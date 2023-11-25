package com.solvd.laba.block1.oop;

import com.solvd.laba.block1.oop.exceptions.InsufficientFundsException;
import com.solvd.laba.block1.oop.interfaces.IApproveBuildingMaterials;
import com.solvd.laba.block1.oop.interfaces.IMaintainDocumentation;
import com.solvd.laba.block1.oop.interfaces.IProvideServices;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PurchasingManager extends CompanyEmployee
        implements IProvideServices, IMaintainDocumentation, IApproveBuildingMaterials {

    private static final Logger LOGGER = LogManager.getLogger(PurchasingManager.class);

    private static double projectBudget;
    private double requiredCost;

    public PurchasingManager(String firstName, String lastName, String occupation, double salary,
                             int experience, double projectBudget, double requiredCost) {
        super(firstName, lastName, occupation, salary, experience);
        PurchasingManager.projectBudget = projectBudget;
        this.requiredCost = requiredCost;
    }

    @Override
    public void provideServices() {
        LOGGER.info("I search for suppliers to purchase the needed materials");
    }

    @Override
    public void documentMaintenance() {
        LOGGER.info("I maintain documentation about purchases");
    }

    @Override
    public void buildingMaterialsApproval() {
        LOGGER.info("I give my approval about building materials");
    }

    public void communication() {
        LOGGER.info("I communicate with suppliers about the quality of needed materials");
    }

    public static double makingAPurchase(double requiredCost) throws InsufficientFundsException {
        double fundsLeft;
        if (projectBudget < requiredCost) {
            throw new InsufficientFundsException("The purchase price exceeds the allowable budget");
        } else {
            LOGGER.info("All needed materials are successfully purchased");
            fundsLeft = (projectBudget - requiredCost);
        }
        return fundsLeft;
    }

    public double getProjectBudget() {
        return PurchasingManager.projectBudget;
    }

    public void setProjectBudget(double projectBudget) {
        PurchasingManager.projectBudget = projectBudget;
    }

    public double getRequiredCost() {
        return this.requiredCost;
    }

    public void setRequiredCost(double requiredCost) {
        this.requiredCost = requiredCost;
    }

    @Override
    public String toString() {
        return "PurchasingManager{" +
                "firstName='" + getFirstName() +
                ", lastName=" + getLastName() + '\'' +
                ", occupation=" + getOccupation() +
                ", salary=" + getSalary() + '\'' +
                ", experience=" + getExperience() + '\'' +
                ", projectBudget=" + getProjectBudget() +
                '}';
    }
}

