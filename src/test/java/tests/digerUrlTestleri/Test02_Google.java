package tests.digerUrlTestleri;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test02_Google {

    @Test
    public void test02(){

        SoftAssert softAssert = new SoftAssert();
        GooglePage googlePage = new GooglePage();
        // 2-https://www.google.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        // 3-cookies uyarisini kabul ederek kapatin
        // 4-Sayfa basliginin “Google” ifadesi icerdigini test edin
        String expTitleIc = "Google";
        String actTitle = Driver.getDriver().getTitle();
        softAssert.assertTrue(actTitle.contains(expTitleIc),"title Google icermiyor");
        // 5-Arama cubuguna “Nutella” yazip aratin
        googlePage.aramaCubugu.sendKeys("Nutella" + Keys.ENTER);
        // 6-Bulunan sonuc sayisini yazdirin
        System.out.println(googlePage.aramaSonucYazisi.getText());
        // 7-sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        // Yaklaşık 189.000.000 sonuç bulundu (0,28 saniye)
        String[] sonucYazisiArr = googlePage.aramaSonucYazisi.getText().split(" ");
        String sonucSayisi = sonucYazisiArr[1].replaceAll("\\D","");
        int actSonucSayisi = Integer.parseInt(sonucSayisi);
        int expSonucSayisi = 10000001;
        softAssert.assertTrue(actSonucSayisi>=expSonucSayisi,"sonuc sayısı 10 milyondan kucuk");
        // 8-Sayfayi kapatin
        Driver.closeDriver();
        softAssert.assertAll();
    }
}
