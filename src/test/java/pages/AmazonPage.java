package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement amazonAramaKutusu;

    @FindBy(xpath = "(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]")
    public WebElement aramaSonucElementi;

    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")
    public WebElement ilkSonucElementi;

    @FindBy(xpath = "//*[@*='nav_cs_3']")
    public WebElement giftKartElementi;

    @FindBy(xpath = "//a[@aria-label='Specialty Gift Cards']")
    public WebElement SpecialtyGiftCardsbutonElementi;

    @FindBy(xpath = "(//span[@class='a-truncate-cut'])[1]")
    public WebElement bestSellerIlkUrun;

    @FindBy(id = "gc-mini-picker-amount-2")
    public WebElement giftCardDetails25$Elementi;

    @FindBy(xpath = "//span[@id='gc-live-preview-amount']")
    public WebElement urunUcretiElementi;


}
