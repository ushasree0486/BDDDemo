package api.cucumber.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver webDriver;
    /* private By txt_username=By.id("user-name");
     private By txt_password=By.id("password");
     private By btn_login=By.id("login-button");
     private By ltn_logout=By.id("logout_sidebar_link");
 */
    private By txt_username = By.name("email");
    private By txt_password = By.name("password");
    private By btn_login = By.xpath("//input[@type='submit']");
    //private By forgottenPasswordLinkLocator = By.linkText("Forgotten Password");
    private By btn_logout = By.linkText("Logout");

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        if (!webDriver.getTitle().equals("Naveen automation labs")) {
            throw new IllegalStateException("This is not Login Page.The current page is " + webDriver.getCurrentUrl());
        }
    }

    public void enterUsername(String username) {
        webDriver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password) {
        webDriver.findElement(txt_password).sendKeys(password);
    }

    public void clickLogin() {
        webDriver.findElement(btn_login).click();
    }

    public boolean checkLogOutIsDisplayed() {
        return webDriver.findElement(btn_logout).isDisplayed();
    }

    public void loginValidUser(String username, String password) {
        webDriver.findElement(txt_username).sendKeys(username);
        webDriver.findElement(txt_username).sendKeys(password);
        webDriver.findElement(btn_login).click();
    }

}
