package tests.amazonTestleri;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonTest04 {

    @Test
    public void test04(){

        AmazonPage amazonPage = new AmazonPage();

        // 2-https://www.amazon.com adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // 3-amazon arama kutusunu locate edin
        // 4-arama kutusuna “Nutella” yazdirin
        //5-arama islemini yapabilmek icin ENTER tusuna basin
        //    *** AmazonPage ' de locate edildi***
        amazonPage.amazonAramaKutusu.sendKeys
                        (ConfigReader.getProperty("amazonAramaKutusu")+ Keys.ENTER);

        Driver.closeDriver();
    }
}
