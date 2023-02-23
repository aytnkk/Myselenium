package tekrarlar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ders4 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.google.com");

        // cookies'i reddederek cookies ekranini kapatin
        driver.findElement(By.xpath("//div[text()='Tümünü reddet']")).click();
        // arama cubuguna Java yazip aratin
       WebElement aramaCubugu= driver.findElement(By.xpath("//input[@name='q']"));
aramaCubugu.sendKeys("java" + Keys.ENTER);

        // bulunan sonuc sayisinin 100binden cok oldugunu test edin

        WebElement sonucSayiElementi= driver.findElement(By.xpath("//div[@id='result-stats']"));

        System.out.println(sonucSayiElementi.getText());
       // Yaklaşık 1.660.000.000 sonuç bulundu (0,36 saniye)
        String sonucyazisi=sonucSayiElementi.getText();
        String[] sonucyazisiarr=sonucyazisi.split(" ");
        String sonucsayisistr=sonucyazisiarr[1];
        sonucsayisistr=sonucsayisistr.replaceAll("\\D","");

        int actualsonucsyisi=Integer.parseInt(sonucsayisistr);
        int expectedSonucsayisi=100000;
        if (actualsonucsyisi>expectedSonucsayisi){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }

    }
}
