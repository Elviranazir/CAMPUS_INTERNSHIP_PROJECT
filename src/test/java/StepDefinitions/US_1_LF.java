package StepDefinitions;

import Pages.Pages;
import Utilities.BaseDriver;
import Utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class US_1_LF extends MyMethods {
    Pages p = new Pages();
    @Given("Access the Login screen")
    public void accessTheLoginScreen() {

        //BaseDriver.getDriver().get("https://test.mersys.io/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://test.mersys.io/");
    }

    @And("Enter valid username and valid password")
    public void enterValidUsernameAndValidPassword() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        p.username.sendKeys("Student_2");
        p.password.sendKeys("S12345");
    }

    @And("Click on the Login button.")
    public void clickOnTheLoginButton() {
        p.loginButton.click();
    }

    @Then("Home page should be displayed")
    public void homePageShouldBeDisplayed() {
        Assert.assertTrue(p.welcomeText.isDisplayed(), "Test Failed");
    }

    @And("Enter invalid username and invalid password")
    public void enterInvalidUsernameAndInvalidPassword() {
        p.username.sendKeys("Student");
        p.password.sendKeys("S1234");
    }

    @Then("Error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        Assert.assertTrue(p.loginErrorMessage.isDisplayed(),"Test Failed");
    }
}
