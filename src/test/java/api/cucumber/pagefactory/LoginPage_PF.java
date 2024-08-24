package api.cucumber.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class LoginPage_PF {
    WebDriver webDriver;
    @FindBy(name = "email")
    @CacheLookup
    //instead of storing the data in database we can store that data in the Rom.
    // the webelements which is not frequently changed.this is called caching mechanism
    WebElement txt_username;

    @FindBy(name = "password")
    WebElement txt_password;

    @FindBy(xpath = "//input[@class='btn btn-primary']")
    WebElement btn_login;

   /* @FindBy(partialLinkText = "shirts")
    List<WebElement> myLinks;*/
    @FindBy(how= How.NAME,using = "email")
    WebElement abd;

    public LoginPage_PF(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);

        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(webDriver, 30);
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 30), this);
    }

    public void enterUsername(String username) {
        txt_username.sendKeys(username);
    }

    public void enterPassword(String password) {
        txt_password.sendKeys(password);
    }

    public void clickOnLogin() {
        btn_login.click();
    }


}
