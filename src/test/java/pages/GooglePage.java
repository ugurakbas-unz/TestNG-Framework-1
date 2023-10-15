package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {

    public GooglePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

        @FindBy(id = "APjFqb")
    public WebElement aramaCubugu;

    @FindBy(id = "result-stats")
    public WebElement aramaSonucYazisi;
}
