package tests.digerUrltestleri;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import pages.PageAutomationeEx;
import utilities.Driver;

import java.util.List;

public class Test01_AutomationEx {

    @Test
    public void test01(){

        PageAutomationeEx pageAutomationeEx = new PageAutomationeEx();

        // 2-https://www.automationexercise.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));
        // 3-Category bolumundeki elementleri locate edin
        // 4-Category bolumunde 3 element oldugunu test edin
        List<WebElement> categoryBolumuSayisiElementi = pageAutomationeEx.categoryBolumuSayisi;

        int expCategorySayisi = 3;
        int actCategorySayisi = categoryBolumuSayisiElementi.size();
        Assert.assertEquals(actCategorySayisi,expCategorySayisi);
        // 5-Category isimlerini yazdirin
        WebElement categoryElement = pageAutomationeEx.categoryBolumu;
        System.out.println(categoryElement.getText());
        // 6-Sayfayi kapatin
        Driver.closeDriver();
    }
}
