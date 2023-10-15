package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutomationeExPage {

    public AutomationeExPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='accordian']")
    public WebElement categoryBolumu;

    @FindBy(xpath = "//h4[@*='panel-title']")
    public List<WebElement> categoryBolumuSayisi;

    @FindBy(tagName = "a")
    public List<WebElement> linkSayisi;

    @FindBy(xpath = "//a[@href=\"/products\"]")
    public WebElement productsLinki;

    @FindBy(id = "sale_image")
    public WebElement specialOfferYazisi;
}
