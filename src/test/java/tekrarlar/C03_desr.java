package tekrarlar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_desr {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_win32.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        // arama kutusunu locate edip bir webelement olarak kaydedin
        // id'si twotabsearchtextbox olan webelement seklinde locate edecegiz.

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));


       //arama kutusuna "Nutella" yazip aratin.
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
       // aramaKutusu.submit();
        driver.close();

    }
}
