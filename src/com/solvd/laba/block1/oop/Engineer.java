package com.solvd.laba.block1.oop;

import com.solvd.laba.block1.oop.exceptions.NotEnoughInfo;
import com.solvd.laba.block1.oop.interfaces.IProvideServices;
import com.solvd.laba.block1.oop.interfaces.IUpgradeQualification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Engineer extends CompanyEmployee implements IProvideServices, IUpgradeQualification {

    private static final Logger LOGGER = LogManager.getLogger(Engineer.class);

    static {
        System.setProperty("log4.configurationFile", "log4j2.xml");
    }

    private String firstName;
    private String lastName;
    private String occupation;
    private double salary;
    private int experience;
    public boolean enoughInfo;

    public Engineer(String firstName, String lastName, String occupation, double salary, int experience,
                    boolean enoughInfo) {
        super(firstName, lastName, occupation, salary, experience);
        this.enoughInfo = enoughInfo;
    }

    public Engineer() {
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return this.occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return this.experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "salary=" + salary +
                '}';
    }

    public static void checkingForEnoughInfo(boolean enoughInfo) throws NotEnoughInfo {
        if (!enoughInfo) {
            throw new NotEnoughInfo("Cannot execute project. Please, provide more details");
        } else {
            LOGGER.info("Order has been accepted for execution");
        }
    }



    @Override
    public void provideServices() {
        LOGGER.info("I create a design for a new project");
    }

    public void passesDesignToProcurementDept() {
        LOGGER.info("Check for the needed materials according to provided design");
    }

    @Override
    public void qualificationUpgrading() {
        LOGGER.info("I regularly upgrade my knowledge and skills in engineering");
    }
}

