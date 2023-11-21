package com.solvd.laba.block1.oop;

import com.solvd.laba.block1.oop.exceptions.OutOfTimeException;
import com.solvd.laba.block1.oop.interfaces.IUpgradeQualification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;

public class BuildingCrew implements IUpgradeQualification {

    private static final Logger LOGGER = LogManager.getLogger(BuildingCrew.class);

    static {
        System.setProperty("log4.configurationFile", "log4j2.xml");
    }

    private int totalExperience;
    private double minCostPerHour;
    private int workingHours;
    private static int deadlineInMonths;
    private int monthsToBuild;

    private static LinkedList<BuildingCrew> buildingCrewList = new LinkedList<>();

    public BuildingCrew(int totalExperience, double minCostPerHour, int workingHours, int deadlineInMonths,
                        int monthsToBuild) {
        this.totalExperience = totalExperience;
        this.minCostPerHour = minCostPerHour;
        this.workingHours = workingHours;
        this.monthsToBuild = monthsToBuild;
        BuildingCrew.deadlineInMonths = deadlineInMonths;

        buildingCrewList.add(this);
    }

    public BuildingCrew() {
    }

    public int getTotalExperience() {
        return this.totalExperience;
    }

    public void setTotalExperience(int totalExperience) {
        this.totalExperience = totalExperience;
    }

    public double getMinCostPerHour() {
        return this.minCostPerHour;
    }

    public void setMinCostPerHour(double minCostPerHour) {
        this.minCostPerHour = minCostPerHour;
    }

    public int getWorkingHours() {
        return this.workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getDeadlineInMonths() {
        return BuildingCrew.deadlineInMonths;
    }

    public void setDeadline(int deadlineInMonths) {
        BuildingCrew.deadlineInMonths = deadlineInMonths;
    }

    public int getMonthsToBuild() {
        return this.monthsToBuild;
    }

    public void setMonthsToBuild(int monthsToBuild) {
        this.monthsToBuild = monthsToBuild;
    }

    public void buildingWork() {
        LOGGER.info("We provide building services according to engineered plan");
    }

    @Override
    public void provideServices() {
        LOGGER.info("We build a new building according to its design");
    }

    @Override
    public void qualificationUpgrading() {
        LOGGER.info("We regularly have trainings to upgrade our qualification");
    }

    public static int buildingProcess(int monthsToBuild) throws OutOfTimeException {
        int finalWorksTime = 0;
        if (monthsToBuild > deadlineInMonths) {
            throw new OutOfTimeException("Out of limited time");
        } else {
            LOGGER.info("Project is finished in time");
            finalWorksTime = (deadlineInMonths - monthsToBuild);
        }
        return finalWorksTime;
    }
}