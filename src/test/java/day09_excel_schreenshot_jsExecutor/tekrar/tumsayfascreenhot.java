package day09_excel_schreenshot_jsExecutor.tekrar;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class tumsayfascreenhot extends TestBase {
    @Test
    public void test01() throws IOException {

        //amazon anayasfaya gidin
        driver.get("https://www.amazon.com");
        //nutella icin arama yapin
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("nutella" + Keys.ENTER);
        //sonuclarin nutella icerdigini test edin
        String actualSonuc=driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']")).getText();
        String expectedIcerik="nutella";
        Assert.assertTrue(actualSonuc.contains(expectedIcerik));

        //ve rapora eklenmek icin tum sayfanin fotografini cekin

        //tum sayfa screenshot icin,
        //1-Takescreenshot objesi olustur
        TakesScreenshot ts= (TakesScreenshot) driver;
        //2-screenshot'i kaydedecegimiz bir dosya olusturalim
        File tumsayfa=new File("target/schreenshot.png");
        //3-gecici bir dosya olusturup ts objesi ile cekilen fotografi dosyaya kaydediyoruz
        File geciciDosya=ts.getScreenshotAs(OutputType.FILE);
        //4- gecici dosyayi tumsayfass dosyasina kaydedelim
        FileUtils.copyFile(geciciDosya,tumsayfa);

    }
}
