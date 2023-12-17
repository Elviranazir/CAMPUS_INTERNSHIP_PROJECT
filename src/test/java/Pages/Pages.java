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
    //LoginScreen
    @FindBy(css = "input[id='mat-input-0']")   //  locators for US-1 created by Elvira
    public WebElement username;

    @FindBy(css = "input[id=\"mat-input-1\"]")   //  locators for US-1 created by Elvira
    public WebElement password;

    @FindBy(xpath = "//span[.=' LOGIN ']")   //  locators for US-1 created by Elvira
    public WebElement loginButton;

    @FindBy(xpath = "//span[contains(text(),'Welcome')]") //  locators for US-1 created by Elvira
    public WebElement welcomeText;

    @FindBy(className = "class=\"mat-expansion-panel ng-tns-c1859850774-88 ng-star-inserted\"")
    public WebElement loginErrorMessage;

    //Hamburger Icon Drop Down

    @FindBy(xpath = "(//span[@class='mat-ripple mat-mdc-button-ripple'])[4]")   // locators for Test Case 1 created by Yaren
    public WebElement hamburgerIcon;

    @FindBy(xpath = "//span[text()='Messaging']")  // locators for Test Case 1 created by Yaren
    public WebElement HIDropDownMenuMessaging;

    @FindBy(xpath = "//span[text()='New Message']")  // locators for Test Case 1 created by Yaren
    public WebElement HIDropDownMenuNewMessage;

    @FindBy(xpath = "span[text()='Inbox']")  // locators for Test Case 1 created by Yaren
    public WebElement HIDropDownMenuInbox;

    @FindBy(xpath = "//span[text()='Outbox']")  // locators for Test Case 1 created by Yaren
    public WebElement HIDropDownMenuOutbox;

    @FindBy(xpath = "//span[text()='Trash']")  // locators for Test Case 1 created by Yaren
    public WebElement HIDropDownMenuTrash;

}
