package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import testPages.CommonMethodPage;

public class CommonMethodSteps {
    private CommonMethodPage commonMethodPage = new CommonMethodPage();
    @When("User opens the website")
    public void validateHomePage(){
        commonMethodPage.getHomePage();
    }
    @Then("User redirects to Home page")
    public void userRedirectsToHomepage(){
        Assert.assertTrue("Login failed - Welcome message not found", commonMethodPage.isWelcomeMessageDisplayed());
    }

    @And("User redirects to Account page")
    public void userRedirectsToAccountpage() {
        Assert.assertEquals("account creation failed","My Account", commonMethodPage.userRedirectsAccountPage());
    }
}
