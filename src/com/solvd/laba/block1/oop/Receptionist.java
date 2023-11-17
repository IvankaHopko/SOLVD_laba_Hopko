package com.solvd.laba.block1.oop;

import com.solvd.laba.block1.oop.interfaces.IMaintainDocumentation;
import com.solvd.laba.block1.oop.interfaces.IProvideServices;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Receptionist extends CompanyEmployee implements IProvideServices, IMaintainDocumentation {

    private static final Logger LOGGER = LogManager.getLogger(Receptionist.class);

    static {
        System.setProperty("log4.configurationFile", "log4j2.xml");
    }

    private String firstName;
    private String lastName;
    private String occupation;
    private double salary;
    private int experience;
    private int age;

    public Receptionist(String firstName, String lastName, int age, String occupation, double salary, int experience) {
        super(firstName, lastName, occupation, salary, experience);
        this.age = age;
    }

    public Receptionist() {
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

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
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
        return "Receptionist{" +
                "experience=" + experience +
                '}';
    }

    @Override
    public void provideServices() {
        LOGGER.info("I help customer to define the idea");
    }

    public void passesCustomerRequest() {
        LOGGER.info("I have a new project for you to design");
    }

    @Override
    public void documentMaintenance() {
        LOGGER.info("I maintain general company's documentation");
    }
}



