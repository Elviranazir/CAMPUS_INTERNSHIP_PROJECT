package StepDefinitions;

import Pages.Pages;
import Utilities.BaseDriver;
import Utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class StepDefinitions extends MyMethods {
    Pages pages = new Pages();
       @Given("Access the Login screen")
    public void accessTheLoginScreen() {
           try {
               Thread.sleep(3000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           BaseDriver.getDriver().get("https://test.mersys.io/");
    }

    @And("Enter valid username and valid password")
    public void enterValidUsernameAndValidPassword() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pages.username.sendKeys("Student_2");
        pages.password.sendKeys("S12345");
    }

    @And("Click on the Login button.")
    public void clickOnTheLoginButton() {
           pages.loginButton.click();
    }

    @Then("Home page should be displayed")
    public void homePageShouldBeDisplayed() {
        Assert.assertTrue(pages.welcomeText.isDisplayed(), "Test Failed");
    }

    @And("Enter invalid username and invalid password")
    public void enterInvalidUsernameAndInvalidPassword() {
        pages.username.sendKeys("Student");
        pages.password.sendKeys("S1234");
    }

    @Then("Error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
           Assert.assertTrue(pages.loginErrorMessage.isDisplayed(),"Test Failed");
    }
}
