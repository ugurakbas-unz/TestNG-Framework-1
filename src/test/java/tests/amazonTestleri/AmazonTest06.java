package tests.amazonTestleri;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonTest06 {

    @Test
    public void test06(){

        AmazonPage amazonPage = new AmazonPage();
        SoftAssert softAssert = new SoftAssert();
        // 2-https://www.amazon.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // 3-Browseri tam sayfa yapin
        Driver.getDriver().manage().window().maximize();
        // 4-Sayfayi “refresh” yapin
        Driver.getDriver().navigate().refresh();
        // 5-Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String exptitleIcerik = "Spend less";
        String actTitle = Driver.getDriver().getTitle();
        softAssert.assertTrue(actTitle.contains(exptitleIcerik),"sayfa basligi Spend less icermiyor ");
        // 6-Gift Cards sekmesine basin
        amazonPage.giftKartElementi.click();
        // 7-Specialty Gift Cards butonuna basin
        amazonPage.SpecialtyGiftCardsbutonElementi.click();
        // 8-Best Seller bolumunden ilk urunu tiklayin
        amazonPage.bestSellerIlkUrun.click();
        // 9-Gift card details’den 25 $’i  secin
        amazonPage.giftCardDetails25$Elementi.click();
        // 10-Urun ucretinin 25$ oldugunu test edin
        String expUrunUcreti = "25$";
        String actUrunUcreti = amazonPage.urunUcretiElementi.getText();
        System.out.println(actUrunUcreti);
        softAssert.assertEquals(actUrunUcreti,expUrunUcreti,"Urun ucreti yazısı 25$ degil");
        // 11-Sayfayi kapatin
        Driver.closeDriver();

        softAssert.assertAll();

    }
}
