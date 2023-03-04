package day09_excel_schreenshot_jsExecutor.tekrar;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class webelementschreenshot extends TestBase {
    @Test
    public void test01() throws IOException {
        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        // Nutella icin arama yapin
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        // Sonuclarin Nutella icerdigini test edin
        WebElement sonucYaziElementi= driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        String actualSonucYazisi =sonucYaziElementi.getText();
        String expectedIcerik = "Nutella";
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
        // ve rapora eklenmek icin sonuc yazisi elementinin fotografini cekin
        // 1- fotograf cekilecek elementi locate edin
        // 2- Dosyayi kaydetmek icin bir File olusturun
        File elementss=new File("target/elementss.jpg");
        // 3- webelement ile screenshot cekip gecici dosyaya kaydedin
        File gecicidosyass=sonucYaziElementi.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(gecicidosyass,elementss);
        TakesScreenshot tos= (TakesScreenshot) driver;

    }
}
