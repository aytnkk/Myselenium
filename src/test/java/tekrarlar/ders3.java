package tekrarlar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ders3 {
    public static void main(String[] args) {
        //1-  bir class olusturun
        //2-  https://www.amazon.com/ adresine gidin
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");
        //3-  Browseri tam sayfa yapin
        //4-  Sayfayi “refresh” yapin
        //5-  Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedIcerik="Spend less";
        String actualitle=driver.getTitle();
        if (actualitle.contains(expectedIcerik)){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }

        driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();

        //6-  Gift Cards sekmesine basin
driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_gc']")).click();
        //7-  Birthday butonuna basin
driver.findElement(By.cssSelector("img[alt='Birthday']")).click();

        //8-  Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[1]")).click();
        //9-  Gift card details’den 25 $’i  secin
        driver.findElement(By.cssSelector("#gc-mini-picker-amount-1")).click();
        //10- Urun ucretinin 25$ oldugunu test edin
        WebElement ucretelemnti=driver.findElement(By.cssSelector("#gc-live-preview-amount"));
        String expectedUcret="25$";
        String actualUcret=ucretelemnti.getText();

        if (actualUcret.equals(actualUcret)){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }
        //11- Sayfayi kapatin
        driver.close();

    }
}