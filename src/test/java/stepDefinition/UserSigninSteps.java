package stepDefinition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import testPages.UserSigninPage;

public class UserSigninSteps {

    private UserSigninPage userSignin = new UserSigninPage();
//    @When("User open the website")
//    public void validateHomePage(){
//        userSignin.getHomePage();
//    }

    @When("User clicks sign in link and redirects to sign in page")
    public void validateUserSigninPage() {
        Assert.assertEquals("Sign in failed", "Customer Login", userSignin.getUserSigninPage());
    }


    @Then("User enters email id {string}")
    public void userEntersEmailId(String email) {
        userSignin.enterUserEmail(email);
    }

    @Then("User enters password {string}")
    public void userEntersPassword(String password) {
        userSignin.enterUserPassword(password);
    }

    @And("User clicks sigin button")
    public void userClicksSiginButton() {
        userSignin.clicksOnSignButton();
    }

}
