package api.cucumber.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
    @FindBy(linkText = "LogOut")
    WebElement btn_logout;
    WebDriver webDriver;

    public HomePage_PF(WebDriver webDriver) {
        this.webDriver = webDriver;
       // PageFactory.initElements(webDriver, HomePage_PF.class);
        PageFactory.initElements(webDriver, this);
    }

    public boolean checkLogOutIsDisplayed() {
       return btn_logout.isDisplayed();
    }
}