package stepDefinition;

import config.DriverFactory;
import io.cucumber.java.en.Given;


import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.SoucedemoPages;

import static utils.Constants.SWAG_LABS;

public class Soucedemo {

    WebDriver driver = DriverFactory.getDriver();
    SoucedemoPages soucedemoPages = new SoucedemoPages(driver);

    @Given("I am on the landing page")
    public void i_am_on_the_landing_page() {
      Assert.assertTrue(driver.getTitle().contains(SWAG_LABS));
    }

    @Then("User enter userName")
    public void user_enter_username() {
        soucedemoPages.enterUserName("standard_user");

    }

    @Then("user enter password")
    public void user_enter_password() {
        soucedemoPages.enterPassword("secret_sauce");

    }

    @Then("user Validates LoginPage")
    public void user_validates_login_page() {
        Assert.assertTrue(soucedemoPages.Header());
        Assert.assertTrue(soucedemoPages. LogBtn());
        Assert.assertTrue(soucedemoPages.loggingCredentials());


    }
    @Then("user click on logging button")
    public void user_click_on_logging_button() {
        soucedemoPages.clickOnLoginBtn();
    }

    @Then("User check Logging is successful")
    public void user_check_logging_is_successful() {
        soucedemoPages.clickOnMenuBtn();
        soucedemoPages.checkLogSuccess();

    }



}
