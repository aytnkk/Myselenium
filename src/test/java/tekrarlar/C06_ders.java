package tekrarlar;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class C06_ders {
    public static void main(String[] args) throws InterruptedException {
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

        //3- Sayfada 147 adet link bulundugunu test edin.

        List<WebElement> linkElementleriListe=driver.findElements(By.tagName("a"));
        int expectedLinkSayisi=147;
        int actualLinkSayisi=linkElementleriListe.size();
        if (expectedLinkSayisi==actualLinkSayisi){
            System.out.println("test passed");

        }else{
            System.out.println("test failed");
        }
        //4- Products linkine tiklayin
        driver.findElement(By.linkText("Products")).click();

        //5- special offer yazisinin gorundugunu test edin
        WebElement specialOfferElementi= driver.findElement(By.id("sale_image"));
if (specialOfferElementi.isDisplayed()){
    System.out.println("test passed");
}else{
    System.out.println("test failed");
}
        //6- Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
