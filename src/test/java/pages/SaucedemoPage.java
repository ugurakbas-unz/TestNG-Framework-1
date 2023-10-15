package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SaucedemoPage {

    public SaucedemoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user-name")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    public WebElement ilkUrun;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCart;

    @FindBy(className = "shopping_cart_link")
    public WebElement sepet;

    @FindBy(id = "item_4_title_link")
    public WebElement sepetKontrol;


}
