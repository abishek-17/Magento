package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import testPages.CreateAccountPage;
import testPages.UserSigninPage;

public class CreateAccountSteps {
    private CreateAccountPage createAccountPage = new CreateAccountPage();
//    @When("User open the website")
//    public void userOpenHomePage(){
//        createAccountPage.getHomePage();
//    }


    @When("User clicks create account link and redirects to create account page")
    public void userClicksCreatelink() {
        Assert.assertEquals("Create account page opened to failed","Create New Customer Account", createAccountPage.getCreateAccountPage());
    }

    @And("User Enter first name {string}")
    public void userEnterFirstName(String firstName) {
        createAccountPage.enterFirstName(firstName);
    }

    @And("User Enter last name {string}")
    public void userEnterLastName(String lastName) {
        createAccountPage.enterLastName(lastName);
    }

    @And("User Enter new email {string}")
    public void userEnterNewEmail(String newEmail) {
        createAccountPage.enterNewEmail(newEmail);
    }

    @And("User Enter new password {string}")
    public void userEnterNewPassword(String newPassword) {
        createAccountPage.enterNewPassword(newPassword);
    }

    @And("User Enter confirm password {string}")
    public void userEnterConfirmPassword(String confirmPassword) {
        createAccountPage.enterConfrimPassword(confirmPassword);
    }

    @Then("User clicks create account button")
    public void userClicksCreateAccountButton() {
        createAccountPage.userClicksCreateAccountButton();
    }

}
