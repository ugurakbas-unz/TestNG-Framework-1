package tests.youtubeTestleri;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class YoutubeTest02 {

    @Test
    public void test02(){

        SoftAssert softAssert = new SoftAssert();

        // 2. Youtube web sayfasına gidin ve sayfa başlığının “youtube”olup olmadığını
        //doğrulayın(verify), eğer değilse doğru başlığı(Actual Title) konsoldayazdirin.
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));
        String expTitle = "youtube";
        String actTitle = Driver.getDriver().getTitle();
        softAssert.assertEquals(actTitle,expTitle,"actual titile "+Driver.getDriver().getTitle());
        // 3. Sayfa URL'sinin “youtube” içerip içermediğini(contains) doğrulayın, içermiyorsa
        //doğruURL'yi yazdırın.
        String expUrlIcerik = "youtube";
        String actUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actUrl.contains(expUrlIcerik),"actual url "+Driver.getDriver().getCurrentUrl());
        // 4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        Driver.getDriver().navigate().to(ConfigReader.getProperty("amazonUrl"));
        // 5. Youtube sayfasina geri donun
        Driver.getDriver().navigate().back();
        //6. Sayfayi yenileyin
        Driver.getDriver().navigate().refresh();
        // 7. Amazon sayfasina donun
        Driver.getDriver().navigate().forward();
        // 8. Sayfayi tamsayfa yapin
        Driver.getDriver().manage().window().maximize();
        // 9. Ardından sayfa başlığının "Amazon" içerip içermediğini(contains) doğrulayın,
        //Yoksadoğru başlığı(Actual Title) yazdırın.
        expTitle = "Amazon";
        actTitle = Driver.getDriver().getTitle();
        softAssert.assertTrue(actTitle.contains(expTitle),"actal title "+ Driver.getDriver().getTitle());
        // 10.Sayfa URL'sinin https://www.amazon.com olup olmadığını doğrulayın, degilse
        //doğruURL'yi yazdırın
        expUrlIcerik = "https://www.amazon.com";
        actUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actUrl,expUrlIcerik,"actual url "+ Driver.getDriver().getCurrentUrl() );
        // 11.Sayfayi kapatin
        Driver.closeDriver();

        softAssert.assertAll();
    }
}
