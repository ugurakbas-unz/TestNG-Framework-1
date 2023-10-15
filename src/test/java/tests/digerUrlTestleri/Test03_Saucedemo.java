package tests.digerUrlTestleri;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.SaucedemoPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test03_Saucedemo {

    @Test
    public void test03(){

        SaucedemoPage saucedemoPage = new SaucedemoPage();
        SoftAssert softAssert = new SoftAssert();
        // 1. “https://www.saucedemo.com” Adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("sdUrl"));
        // 2. Username kutusuna “standard_user” yazdirin
        saucedemoPage.username.sendKeys("standard_user");
        // 3. Password kutusuna “secret_sauce” yazdirin
        saucedemoPage.password.sendKeys("secret_sauce");
        // 4. Login tusuna basin
        saucedemoPage.loginButton.click();
        // 5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        String ilkUrunIsmi = saucedemoPage.ilkUrun.getText();
        saucedemoPage.ilkUrun.click();
        // 6. Add to Cart butonuna basin
        saucedemoPage.addToCart.click();
        // 7. Alisveris sepetine tiklayin
        saucedemoPage.sepet.click();
        // 8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        softAssert.assertTrue(saucedemoPage.sepetKontrol.isDisplayed(),"urun sepete eklenmemis");
        // 9. Sayfayi kapatin
        Driver.closeDriver();
    }
}
