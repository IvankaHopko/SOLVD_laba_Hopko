package com.solvd.laba.block1.oop;

import com.solvd.laba.block1.oop.interfaces.IMaintainDocumentation;
import com.solvd.laba.block1.oop.interfaces.IPayWhenWorkIsDone;
import com.solvd.laba.block1.oop.interfaces.IProvideServices;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class Accountant extends CompanyEmployee
        implements IProvideServices, IMaintainDocumentation, IPayWhenWorkIsDone {

    private static final Logger LOGGER = LogManager.getLogger(Accountant.class);

    static {
        System.setProperty("log4.configurationFile", "log4j2.xml");
    }

    private String firstName;
    private String lastName;
    private String occupation;
    protected double salary;
    protected int experience;
    private boolean enoughMoney;

    protected Accountant(String firstName, String lastName, String occupation, double salary,
                         int experience, boolean enoughMoney) {
        super(firstName, lastName, occupation, salary, experience);
        this.enoughMoney = enoughMoney;
    }

    public Accountant() {
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

    public boolean getEnoughMoney() {
        return this.enoughMoney;
    }

    public void setEnoughMoney(boolean enoughMoney) {
        this.enoughMoney = enoughMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Accountant)) return false;
        Accountant that = (Accountant) o;
        return Objects.equals(firstName, that.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName);
    }

    public void checkingForEnoughMoney() {
        if (enoughMoney) {
            LOGGER.info("There is enough money to pay the purchase invoice");
        } else {
            LOGGER.info("Not enough money");
        }
    }

    @Override
    public void provideServices() {
        LOGGER.info("I pay salary to building staff and I pay for the purchases of materials");
    }

    @Override
    public void doneWorkPayment() {
        LOGGER.info("I pay money for the work that is done");
    }

    @Override
    public void documentMaintenance() {
        LOGGER.info("I maintain accounting documents of the building company");
    }

    public static void taxReporting() throws FileNotFoundException {
        try (FileReader fileReader = new FileReader("Settlement accounting journal.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            StringBuilder content = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }

            String fileContent = content.toString();
            LOGGER.info(fileContent);
        } catch (IOException e) {
            LOGGER.error("Documentation mistake occurred that needs to be checked");
        }
    }
}
