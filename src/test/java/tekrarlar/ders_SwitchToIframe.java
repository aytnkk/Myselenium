package tekrarlar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class ders_SwitchToIframe extends TestBase {
    @Test
    public void test01(){
        // https://the-internet.herokuapp.com/iframe  adresine gidin
        driver.get("https://the-internet.herokuapp.com/iframe");
        // "Your content goes here." yazisinin gorunur oldugunu test edin
        WebElement frameElementi=driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(frameElementi);
        WebElement yaziElemeti=driver.findElement(By.tagName("p"));
        Assert.assertTrue(yaziElemeti.isDisplayed());

        // Elemental Selenium linkine click yapin
        driver.switchTo().parentFrame();

        driver.findElement(By.linkText("Elemental Selenium")).click();
        bekle(3);
    }

}
