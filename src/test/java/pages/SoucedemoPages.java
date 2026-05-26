package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ElementUtil;

public class SoucedemoPages {

    private WebDriver driver;
    private ElementUtil elementUtil;

    public SoucedemoPages(WebDriver driver) {
        this.driver = driver;
         elementUtil = new ElementUtil(driver);

    }

    private By usernameField = By.xpath("//input[@name='user-name']");
    private By passwordField = By.xpath("//input[@name='password']");
    private By HeaderSwagLab = By.xpath("//div[@class='login_logo']");
    private By loginBtnView =  By.xpath("//input[@class='submit-button btn_action']");
    private By LogCredentil =  By.xpath("//div[@class='login_credentials']");
    private By clickLoginBtn = By.id("login-button");
    private By menuBtnView =  By.xpath("//button[@id='react-burger-menu-btn']");
    private By logSuccess =  By.xpath("//a[@id='logout_sidebar_link']");


    public void enterUserName(String username) {
        elementUtil.type(usernameField, username);


    }

    public void enterPassword(String password) {
        elementUtil.type(passwordField, password);
    }

    public boolean Header(){
       return elementUtil.isDisplayed(HeaderSwagLab);
    }

    public boolean LogBtn(){
        return elementUtil.isDisplayed(loginBtnView);
    }

    public boolean loggingCredentials(){
        return elementUtil.isDisplayed(LogCredentil);
    }
    public void clickOnLoginBtn(){
        elementUtil.click(clickLoginBtn);
    }
    public void clickOnMenuBtn (){
        elementUtil.click(menuBtnView);
    }

    public void checkLogSuccess(){
        elementUtil.click(logSuccess);
    }

}
