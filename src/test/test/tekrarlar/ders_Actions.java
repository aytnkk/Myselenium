package tekrarlar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.Set;

public class ders_Actions extends TestBase {
    @Test
    public void test01() {
        //2- https://the-internet.herokuapp.com/context_menu sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");
        //3- Cizili alan uzerinde sag click yapin
        Actions actions = new Actions(driver);
        WebElement cizgilalanaeklementi= driver.findElement(By.id("hot-spot"));
   actions.contextClick(cizgilalanaeklementi).perform();

        //4- Alert’te cikan yazinin “You selected a context menu” oldugunu test edin.
   String expectedAlerrtYazisi="You selected a context menu";
   String actualAlertyazisi=driver.switchTo().alert().getText();
        Assert.assertEquals(expectedAlerrtYazisi,actualAlertyazisi);
        //5- Tamam diyerek alert’i kapatalim
        driver.switchTo().alert().accept();


        //6- Elemental Selenium linkine tiklayalim
        String ilksayfahndl=driver.getWindowHandle();
        driver.findElement(By.linkText("Elemental Selenium")).click();
        Set<String> tumsayfalarhndle=driver.getWindowHandles();
        String ilksayfamwhd="";
        for (String each:tumsayfalarhndle
             ) {
            if (!each.equals(ilksayfamwhd)){
                ilksayfamwhd=each;
            }
            driver.switchTo().window(ilksayfamwhd);
            //7- Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim
            String expectedYazi= "Elemental Selenium";
            String actualYazi = driver.findElement(By.tagName("h1")).getText();
            Assert.assertEquals(expectedYazi,actualYazi);
            bekle(3);

        }
    }
}