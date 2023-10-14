package tests.amazonTestleri;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonTest03 {

    @Test
    public void test03(){


        // 2. Amazon soyfasina gidelim. https://www.amazon.com/
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // 3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("boyut: "+Driver.getDriver().manage().window().getSize());
        System.out.println("konum: "+Driver.getDriver().manage().window().getPosition());
        // 4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        Driver.getDriver().manage().window().setSize(new Dimension(200,200));
        Driver.getDriver().manage().window().setPosition(new Point(200,200));
        // 5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin

        // 8. Sayfayi kapatin
    }
}
