package tests.facebookTestleri;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class FacebookTest01 {

    @Test
    public void test01(){

        SoftAssert softAssert = new SoftAssert();
        // 2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin
        //(title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi
        //yazdirin.
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        // 3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa
        //“actual” URL’i yazdirin.
        String expUrlIcerik = "facebook";
        String actUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actUrl.contains(expUrlIcerik),Driver.getDriver().getCurrentUrl());
        // 4.https://www.walmart.com/sayfasina gidin.
        Driver.getDriver().get(ConfigReader.getProperty("walmartUrl"));
        // 5.Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expTitleIcerik = "Walmart.com";
        String actTitle = Driver.getDriver().getTitle();
        softAssert.assertEquals(actTitle,expTitleIcerik,"title Walmart.com içermiyor ");
        // 6.Tekrar “facebook” sayfasina donun
        Driver.getDriver().navigate().back();
        // 7.Sayfayi yenileyin
        Driver.getDriver().navigate().refresh();
        // 9.Browser’i  kapatin
        Driver.closeDriver();

        softAssert.assertAll();
    }
}
