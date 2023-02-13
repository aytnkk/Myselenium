package day01_SeleniumaGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_driverMethodlari {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.wisequarter.com");
        System.out.println(driver.getWindowHandle()); //CDwindow-9415FA63C7AFFDD1AD28CF562EF432A5

        System.out.println(driver.getWindowHandles()); //CDwindow-9415FA63C7AFFDD1AD28CF562EF432A5
        // test sirasinda birden fazla sayfa acildiysa bir set olarak ,tum sayfalarin window degerlerini dondurur

        System.out.println(driver.getPageSource());// butun sayfa kodlarini getirir.

        String expectedIcerik="2 hours weekly meeting with the team";
        String actualSayfaKodlari=driver.getPageSource();

        if (actualSayfaKodlari.contains(expectedIcerik)){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }
        driver.quit();
        // close ile quit sayfayi kapatmak icin kullanilir .close sadece bir sayfay kapatirken ,quit test sirasinda
        //acilan butun sayfalari kapatir
       // driver.close();
    }
}
