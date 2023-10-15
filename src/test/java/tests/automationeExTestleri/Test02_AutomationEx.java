package tests.automationeExTestleri;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AutomationeExPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class Test02_AutomationEx {

    @Test
    public void test02(){

        AutomationeExPage pageAutomationeEx = new AutomationeExPage();
        SoftAssert softAssert = new SoftAssert();

        // 2-https://www.automationexercise.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));
        // 3-Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> linkSayisiElementleriList = pageAutomationeEx.linkSayisi;
        int expLinkSayisi = 147;
        int actLinkSayisi = linkSayisiElementleriList.size();
        softAssert.assertEquals(actLinkSayisi,expLinkSayisi,"link sayısı 147 adet değil");
        // 4-Products linkine tiklayin
        pageAutomationeEx.productsLinki.click();
        // 5-special offer yazisinin gorundugunu test edin
        softAssert.assertTrue(pageAutomationeEx.specialOfferYazisi.isDisplayed(),"special Offer yazisi görünmüyor");
        // 6-Sayfayi kapatin
        Driver.closeDriver();

        softAssert.assertAll();

    }
}
