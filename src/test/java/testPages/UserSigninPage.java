package testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;
import utility.ConfigReader;

import java.time.Duration;

public class UserSigninPage {
    WebDriver driver = BrowserDriver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//    public void getHomePage(){
//        String str = driver.getTitle();
//        System.out.println(str);
//    }

    public String getUserSigninPage() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConfigReader.getLocatorValue("signinLink")))).click();
        wait.until(ExpectedConditions.titleContains("Customer Login"));
        System.out.println(driver.getTitle());
        return driver.getTitle();
    }

    public void enterUserEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfigReader.getLocatorValue("email")))).sendKeys(email);
        System.out.println("Email XPath: " + email);
    }

    public void enterUserPassword(String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfigReader.getLocatorValue("password")))).sendKeys(password);
        System.out.println("Password XPath: " + password);
    }

    public void clicksOnSignButton(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConfigReader.getLocatorValue("signinButton")))).click();
        System.out.println("Sign-in Button XPath: " + ConfigReader.getLocatorValue("signinButton"));

    }

    public void closeDriver(){
        driver.quit();
    }
}
