package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuappPage {

    public HerokuappPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[.='Add Element']")
    public WebElement addElementButonElementi;

    @FindBy(xpath = "//*[@*='added-manually']")
    public WebElement deleteButonuElementi;

    @FindBy(tagName = "h3")
    public WebElement add_removeElementsElementi;
}
