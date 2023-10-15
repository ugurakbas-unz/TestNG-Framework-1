package utilities;

import org.openqa.selenium.Keys;
import pages.AmazonPage;

public class AmazonAramaSonucSayisi {

    public static void aramaSonucSayisi(String[] arr){


        //[1-16, of, 136, results, for, "city, bike"] amazon arama sonuc yazısı

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("result")){
                index = i;
            }

        }
        String sonucsayisiInt = arr[index-1].replaceAll("\\D","");
        int sonucSayisi = Integer.parseInt(sonucsayisiInt);
        System.out.println("aranan metin ile ilgili " +sonucSayisi+ " adet sonuc bulunmuştur");
    }
}
