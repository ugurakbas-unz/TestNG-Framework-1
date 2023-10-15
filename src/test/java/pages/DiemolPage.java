package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DiemolPage {

    public DiemolPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "pid3_thumb")
    public WebElement NYCElementi;
}
