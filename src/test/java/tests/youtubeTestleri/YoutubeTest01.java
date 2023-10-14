package tests.youtubeTestleri;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class YoutubeTest01 {

    @Test
    public void test01(){

        SoftAssert softAssert = new SoftAssert();

        // 2. Youtube ana sayfasina gidelim . https://www.youtube.com/
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));
        // 3. Amazon soyfasina gidelim. https://www.amazon.com/
        Driver.getDriver().navigate().to(ConfigReader.getProperty("amazonUrl"));
        // 4. Tekrar YouTube’sayfasina donelim
        Driver.getDriver().navigate().back();
        // 5. Yeniden Amazon sayfasina gidelim
        Driver.getDriver().navigate().forward();
        // 6. Sayfayi Refresh(yenile) yapalim
        Driver.getDriver().navigate().refresh();
        // 7. Sayfayi kapatalim / Tum sayfalari kapatalim
        Driver.closeDriver();

        softAssert.assertAll();



    }
}
