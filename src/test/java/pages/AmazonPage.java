package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AmazonPage {

    public void aramaSonucSayisi(String[] arr){


        //[1-16, of, 136, results, for, "city, bike"] amazon arama sonuc yazısı

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("result")){
                index = i;
            }

        }
        String sonucsayisiInt = arr[index-1].replaceAll("\\D","");
        int sonucSayisi = Integer.parseInt(sonucsayisiInt);
        System.out.println("aranan metin ile ilgili " +sonucSayisi+ " adet sonuc bulunmuştur");
    }

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

    @FindBy(xpath = "//span[@class='a-size-base a-color-base']")
    public List<WebElement> tumSayfaBasliklari;


}
