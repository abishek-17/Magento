package stepDefinition;

import io.cucumber.java.After;
import utility.BrowserDriver;

public class Hooks {

    @After
    public void tearDown() {
        if (BrowserDriver.getDriver() != null) {
            BrowserDriver.close();
            System.out.println("Driver closed successfully.");
        }
    }
}
