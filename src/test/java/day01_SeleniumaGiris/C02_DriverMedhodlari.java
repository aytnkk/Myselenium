package day01_SeleniumaGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMedhodlari {
    public static void main(String[] args) throws InterruptedException {

        /*
        jar dosyalarini yukleyerek selenium'u kullanilir hale getirdik
        ancak her bir classin hangi browser ile calismasini istiyorsak ,
        o browser ile ilgili driver'i class'da tanimlamamiz lazim.
        Browser ile ilgili tercihimiz dogrultusunda ilgili ayarlari yapmak icin javadaki
        System classindan setPropert()'i kullanilir.

        method'a 2 parametre ekleyecegiz
        1-parametre herkes icin ayni:webdriver.chrome.driver
        2-parametre bu driverin dosya yolu herkesin bilgisayarinda farkli olabilir.
        windowsta sonunda .exe yazilmalidir.
       */

       System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        //istenen sayfaya gitmek icin
        driver.get("https://www.wisequarter.com");
        Thread.sleep(3000);




      driver.close();


    }
}
