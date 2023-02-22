package tekrarlar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.Set;

public class ders_SwitchToWindow extends TestBase {

    @Test
    public void test01() {
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın
        WebElement ilkSayfaYaziElementi= driver.findElement(By.tagName("h3"));
        String expectedYazi="Opening a new window";
        String actualYazi= ilkSayfaYaziElementi.getText();
        Assert.assertEquals(expectedYazi,actualYazi);

        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
String expectedTitle="The Internet";
String actualTitle=driver.getTitle();
Assert.assertEquals(expectedTitle,actualTitle);
bekle(2);
String ilksayfaHandle=driver.getWindowHandle();
        //● Click Here butonuna basın
        driver.findElement(By.linkText("Click Here")).click();


        Set<String> tumSayfalarWHDSeti=driver.getWindowHandles();
        String ikincisayfam="";
        for (String each:tumSayfalarWHDSeti
        ) {
            if (!each.equals(ikincisayfam)) {
                ikincisayfam = each;
            }
        }
            driver.switchTo().window(ikincisayfam);
            expectedTitle = "New window";
            actualTitle = driver.getTitle();
            Assert.assertEquals(expectedTitle, actualTitle);

        //● Sayfadaki textin “New Window” olduğunu doğrulayın.
        String ikinciSayfaYazi= driver.findElement(By.tagName("h3")).getText();
        expectedYazi="New Window";
        Assert.assertEquals(expectedYazi,ikinciSayfaYazi);


//● Bir önceki pencereye geri döndükten sonra
driver.switchTo().window(ilksayfaHandle);
// sayfa başlığının “The Internet” olduğunu doğrulayın.
        expectedTitle = "The Internet";
        actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        bekle(3);
    }



    }
