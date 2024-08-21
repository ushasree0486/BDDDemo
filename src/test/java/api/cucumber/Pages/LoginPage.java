package api.cucumber.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver webDriver;
    private By txt_username=By.id("name");
    private By txt_password=By.id("password");
    private By btn_login=By.id("login");
    private By ltn_logout=By.id("logout");

    public LoginPage(WebDriver webDriver){
        this.webDriver=webDriver;
        if(!webDriver.getTitle().equals("TestProject Demo")){
            throw new IllegalStateException("This is not Login Page.The current page is "+webDriver.getCurrentUrl());
        }
    }
    public void enterUsername(String username){
        webDriver.findElement(txt_username).sendKeys(username);
    }
    public void enterPassword(String password){
        webDriver.findElement(txt_username).sendKeys(password);
    }
    public void clickLogin(){
        webDriver.findElement(btn_login).click();
    }
    public boolean checkLogOutIsDisplayed(){
        return webDriver.findElement(btn_login).isDisplayed();
    }
    public void loginValidUser(String usename,String password){
        webDriver.findElement(txt_username).sendKeys(usename);
        webDriver.findElement(txt_username).sendKeys(password);
        webDriver.findElement(btn_login).click();
    }

}
