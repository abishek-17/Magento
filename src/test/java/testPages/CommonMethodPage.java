package testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;
import utility.ConfigReader;

import java.time.Duration;

public class CommonMethodPage {
    WebDriver driver = BrowserDriver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void getHomePage(){
        String str = driver.getTitle();
        System.out.println(str);
    }

    public String userRedirectsAccountPage(){
        return driver.getTitle();
    }

    public boolean isWelcomeMessageDisplayed() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement welcomeMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfigReader.getLocatorValue("welcome_message"))));
            return welcomeMessage.isDisplayed();
        } catch (Exception e) {
            System.out.println("Welcome message not found: " + e.getMessage());
            return false;
        }
    }
}
