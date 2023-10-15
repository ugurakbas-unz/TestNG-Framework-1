package tests.amazonTestleri;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.AmazonAramaSonucSayisi;
import utilities.ConfigReader;
import utilities.Driver;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AmazonTest05 {

    @Test
    public void test05(){

        AmazonPage amazonPage = new AmazonPage();
        // 1-https://www.amazon.com/ sayfasına gidin.
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // 2-Arama kutusuna “city bike” yazip aratin
        amazonPage.amazonAramaKutusu.sendKeys("city bike" + Keys.ENTER);
        // 3- Görüntülenen sonuçların sayısını yazdırın
        String aramaSonucstr = amazonPage.aramaSonucElementi.getText();
        String[] sonucYazisiArr = aramaSonucstr.split(" ");
        AmazonAramaSonucSayisi.aramaSonucSayisi(sonucYazisiArr);
        // 4- Listeden ilk urunun resmine tıklayın.
        amazonPage.ilkSonucElementi.click();

        Driver.closeDriver();
    }


}
