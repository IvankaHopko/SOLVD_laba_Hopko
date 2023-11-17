package com.solvd.laba.block1.oop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class CompanyOwner {

    private static final Logger LOGGER = LogManager.getLogger(CompanyOwner.class);

    static {
        System.setProperty("log4.configurationFile", "log4j2.xml");
    }

    private final String firstName = "Chandler";
    private final String lastName = "Bing";
    private boolean soleOwnership;

    static {
        LOGGER.info("CompanyOwner class is being initialized");
    }

    public CompanyOwner(boolean soleOwnership) {
        this.soleOwnership = soleOwnership;
    }

    public void runsTheCompany() {
        if (soleOwnership) {
            LOGGER.info("You can make any decision concerning the building company");
        } else {
            LOGGER.info("You need to consult with a lawyer");
        }
    }
}
