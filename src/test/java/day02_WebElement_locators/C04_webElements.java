package day02_WebElement_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_webElements {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_win32.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon anasayfaya gidin
        driver.get("https://www.amazon.com");


        /*
        driver'a webelementi tarif etme islemine locate ,bu tarifi yapabilmek icin kullanabilecegim
        degiskenlere de locator denir.

        8 tane locator vardir.
        Locatorlarin 6 tanesi webelementin ozelliklerine baglidir.
        -id
        -classname
        -name
        -tagname
        -linkText
        -partialLinkText

         Geriye kalan iki locator ise her turlu webelementi locate etmek icin kullanilabilir.
        -xpath
        --cssSelector
         */

        // arama kutusunu locate edip bir webelement olarak kaydedin
        // id'si twotabsearchtextbox olan webelement seklinde locate edecegiz.
       WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox")); // bu isleme locator denir

        //arama kutusuna "Nutella" yazip aratin.

        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();

        Thread.sleep(300);




    }
}
