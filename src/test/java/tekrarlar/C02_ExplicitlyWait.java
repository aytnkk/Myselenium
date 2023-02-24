package tekrarlar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C02_ExplicitlyWait {
    @Test
    public void test01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        // arama kutusu clickable oluncaya kadar bekleyin
        // explicitly wait icin
        //  A- wait objesi olustur
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
WebElement aramakutusu=driver.findElement(By.id("twotabsearchtextbox"));
wait.until(ExpectedConditions.elementToBeClickable(aramakutusu));//elementToBeClickable:tiklanabilir oldugunu gosteren methoddur
        // Nutella icin arama yapin
        aramakutusu.sendKeys("Nutella"+ Keys.ENTER);
        Thread.sleep(5000);
        driver.close();
    }
}
