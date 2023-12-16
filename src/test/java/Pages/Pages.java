package Pages;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages extends MyMethods {
    public Pages() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    // locators for Test Case 1 created by Yaren Hamburger Icon Drop Down
    @FindBy(xpath = "(//span[@class='mat-ripple mat-mdc-button-ripple'])[4]")
    public WebElement hamburgerIcon;

    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement HIDropDownMenuMessaging;

    @FindBy(xpath = "//span[text()='New Message']")
    public WebElement HIDropDownMenuNewMessage;

    @FindBy(xpath = "span[text()='Inbox']")
    public WebElement HIDropDownMenuInbox;

    @FindBy(xpath = "//span[text()='Outbox']")
    public WebElement HIDropDownMenuOutbox;

    @FindBy(xpath = "//span[text()='Trash']")
    public WebElement HIDropDownMenuTrash;


}
