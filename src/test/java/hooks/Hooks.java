package hooks;

import config.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    private WebDriver webDriver;

    @Before
    public void setup() {
        webDriver = DriverFactory.initBrowser("chrome");
        webDriver.manage().window().maximize();
        webDriver.get("https://www.saucedemo.com/");


    }

    @After
    public void teardown() {
        DriverFactory.quitDriver();

    }
}
