package tests.amazonTestleri;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AmazonTest02 {

    @Test
    public void test02(){


        // 2. Amazon soyfasina gidelim. https://www.amazon.com/
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // 3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("boyut: "+Driver.getDriver().manage().window().getSize());
        System.out.println("konum: "+Driver.getDriver().manage().window().getPosition());
        // 4. Sayfayi simge durumuna getirin
        Driver.getDriver().manage().window().minimize();
        // 5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        ReusableMethods.bekle(3);
        Driver.getDriver().manage().window().maximize();
        // 6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("boyut max: "+Driver.getDriver().manage().window().getSize());
        System.out.println("konum max: "+Driver.getDriver().manage().window().getPosition());
        // 7. Sayfayi fullscreen yapin
        Driver.getDriver().manage().window().fullscreen();
        // 8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("boyut full: "+Driver.getDriver().manage().window().getSize());
        System.out.println("konum full: "+Driver.getDriver().manage().window().getPosition());
        // 9. Sayfayi kapatin
        Driver.closeDriver();
    }
}
