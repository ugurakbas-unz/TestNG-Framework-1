package utilities;

import org.openqa.selenium.WebDriver;

public class ReusableMethods {


   static int saniye;
    static public void bekle(int saniye){

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
