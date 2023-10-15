package tests.amazonTestleri;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class AmazonTest07 {

    @Test
    public void test07(){

        AmazonPage amazonPage = new AmazonPage();

        // 1-https://www.amazon.com/ sayfasina gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // 2-arama kutusunu locate edelim
        // 3-“Samsung headphones” ile arama yapalim
        amazonPage.amazonAramaKutusu.sendKeys("Samsung headphones"+ Keys.ENTER);
        // 4-Bulunan sonuc sayisini yazdiralim
        System.out.println(amazonPage.aramaSonucElementi.getText());
        String[] sonucYazisiArr = amazonPage.aramaSonucElementi.getText().split(" ");
        amazonPage.aramaSonucSayisi(sonucYazisiArr);
        // 5-Ilk urunu tiklayalim
        amazonPage.ilkSonucElementi.click();
        // 6-Bir önceki sayfaya dönüp sayfadaki tum basliklari yazdiralim
        Driver.getDriver().navigate().back();
        List<WebElement> tumSayfaBasliklariElementList = amazonPage.tumSayfaBasliklari;

        for (WebElement each:tumSayfaBasliklariElementList
             ) {
            System.out.println(each.getText());
        }
            Driver.closeDriver();


    }
}
