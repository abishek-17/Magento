package testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;
import utility.ConfigReader;

import java.time.Duration;

public class CreateAccountPage {
    WebDriver driver = BrowserDriver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//    public void getHomePage(){
//        String str = driver.getTitle();
//        System.out.println(str);
//    }
    public String getCreateAccountPage() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConfigReader.getLocatorValue("createAccountLink")))).click();
        wait.until(ExpectedConditions.titleContains("Create New Customer Account"));
        System.out.println(driver.getTitle());
        return driver.getTitle();
    }

    public void enterFirstName(String firstName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfigReader.getLocatorValue("firstName")))).sendKeys(firstName);
        System.out.println("Email XPath: " + firstName);
    }

    public void enterLastName(String lastName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfigReader.getLocatorValue("lastName")))).sendKeys(lastName);
        System.out.println("Email XPath: " + lastName);
    }

    public void enterNewEmail(String newEmail){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfigReader.getLocatorValue("newEmail")))).sendKeys(newEmail);
        System.out.println("Email XPath: " + newEmail);
    }

    public void enterNewPassword(String newpassword){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfigReader.getLocatorValue("newPassword")))).sendKeys(newpassword);
        System.out.println("Email XPath: " + newpassword);
    }

    public void enterConfrimPassword(String confirmPassword){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfigReader.getLocatorValue("confirmPassword")))).sendKeys(confirmPassword);
        System.out.println("Email XPath: " + confirmPassword);
    }

    public void userClicksCreateAccountButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfigReader.getLocatorValue("createAccountButton")))).click();
    }

}
