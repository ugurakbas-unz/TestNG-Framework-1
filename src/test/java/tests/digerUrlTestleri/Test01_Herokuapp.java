package tests.digerUrlTestleri;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HerokuappPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test01_Herokuapp {

    @Test
    public void test01(){

        HerokuappPage herokuappPage = new HerokuappPage();
        SoftAssert softAssert = new SoftAssert();

        // 1-https://the-internet.herokuapp.com/add_remove_elements/adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("herokuappUrl"));
        // 2-Add Element butonuna basin
        herokuappPage.addElementButonElementi.click();
        // 3-Delete butonu’nun gorunur oldugunu test edin
        softAssert.assertTrue(herokuappPage.deleteButonuElementi.isDisplayed(),
                                     "delete butonu görünür degil");
        // 4-Delete tusuna basin
            herokuappPage.deleteButonuElementi.click();
        // 5-“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        softAssert.assertTrue(herokuappPage.add_removeElementsElementi.isDisplayed(),
                "Add/Remove Elements yazisi gorunmuyor");

        Driver.closeDriver();
    }
}
