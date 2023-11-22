package com.solvd.laba.block1.oop;

import com.solvd.laba.block1.oop.exceptions.NotImplementedMethodException;
import com.solvd.laba.block1.oop.exceptions.NotReadyToStartException;
import com.solvd.laba.block1.oop.interfaces.IApproveBuildingMaterials;
import com.solvd.laba.block1.oop.interfaces.IApproveDesign;
import com.solvd.laba.block1.oop.interfaces.IProvideServices;
import com.solvd.laba.block1.oop.interfaces.IUpgradeQualification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Foreman extends CompanyEmployee
        implements IProvideServices, IApproveBuildingMaterials, IApproveDesign, IUpgradeQualification {

    private static final Logger LOGGER = LogManager.getLogger(Foreman.class);

    static {
        System.setProperty("log4.configurationFile", "log4j2.xml");
    }

    private String firstName;
    private String lastName;
    private String occupation;
    private double salary;
    private int experience;
    private boolean readyToStart;

    public Foreman(String firstName, String lastName, String occupation, double salary, int experience,
                   boolean readyToStart) {
        super(firstName, lastName, occupation, salary, experience);
        this.readyToStart = readyToStart;
    }

    public Foreman() {
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

    public boolean getReadyToStart() {
        return this.readyToStart;
    }

    public void setReadyToStart(boolean readyToStart) {
        this.readyToStart = readyToStart;
    }

    @Override
    public String toString() {
        return "Foreman{" +
                "experience=" + experience +
                '}';
    }

    public static boolean checkingForAllNecessaryToStart(boolean readyToStart) throws NotReadyToStartException {
        if (!readyToStart) {
            throw new NotReadyToStartException("Cannot start to work on a project");
        } else {
            LOGGER.info("The project has been successfully started");
        }
        return readyToStart;
    }

    @Override
    public void provideServices() {
        LOGGER.info("I lead the building crew");
    }

    @Override
    public void buildingMaterialsApproval() {
        LOGGER.info("I give my approval about building materials");
    }

    public final void crewLeading() {
        LOGGER.info("I lead the building crew during our work");
    }

    @Override
    public void designApproval() {
        LOGGER.info("I give my approval about the project design");
    }

    @Override
    public void qualificationUpgrading() {
        LOGGER.info("I constantly upgrade my knowledge in building and team managing");
    }

    @Override
    public void documentMaintenance() throws NotImplementedMethodException {
    }

    public static class Foremen<S> implements Comparable<Foreman> {
        private String lastName;
        private int experience;

        public Foremen(String lastName, int experience) {
            this.lastName = lastName;
            this.experience = experience;
        }

        @Override
        public String toString() {
            return "Last Name: " + lastName + " Experience: " + experience;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Foremen)) return false;
            Foremen<S> foremen = (Foremen<S>) o;
            return experience == foremen.experience && Objects.equals(lastName, foremen.lastName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(lastName, experience);
        }

        @Override
        public int compareTo(Foreman o) {
            return Integer.compare(this.experience, o.experience);
        }
    }
}

