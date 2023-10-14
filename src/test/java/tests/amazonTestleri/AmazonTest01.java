package tests.amazonTestleri;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonTest01 {


    @Test
    public void test01(){

        SoftAssert softAssert = new SoftAssert();

        // 3. Amazon sayfasina gidelim. https://www.amazon.com/
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // 4. Sayfa basligini(title) yazdirin
        System.out.println(Driver.getDriver().getTitle());
        // 5. Sayfa basliginin “Amazon” icerdigini test edin
        String actTitle = Driver.getDriver().getTitle();
        String expTitle = "Amazon";
        softAssert.assertTrue(actTitle.contains(expTitle),"title amazon içermiyor ");
        // 6. Sayfa adresini(url) yazdirin
        System.out.println(Driver.getDriver().getCurrentUrl());
        // 7. Sayfa url’inin “amazon” icerdigini test edin.
        String actUrl=Driver.getDriver().getCurrentUrl();
        String expUrl = "amazon";
        softAssert.assertTrue(actUrl.contains(expUrl),"url amazon içermiyor");
        // 8. Sayfa handle degerini yazdirin
        System.out.println(Driver.getDriver().getWindowHandle());
        // 9. Sayfa HTML kodlarinda “shopping” kelimesi gectigini test edin
        String expHtmlIcerik = "shopping";
        String actHtmlIcerik = Driver.getDriver().getPageSource();
        softAssert.assertTrue(actHtmlIcerik.contains(expHtmlIcerik),"HTML kodları shopping kelimesi içermiyor");
        // 10. Sayfayi kapatin.
        Driver.closeDriver();

        softAssert.assertAll();

        git init
        git add .
        git commit -m "first commit"
        git branch -M main
        git remote add origin https://github.com/ugurakbas-unz/TestNG-Framework-2023.git
        git push -u origin main

    }

}
