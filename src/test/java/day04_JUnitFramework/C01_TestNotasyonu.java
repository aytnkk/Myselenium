package day04_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TestNotasyonu {
    /*
    framework: Ortak calisma cercevesi
               hangi dosyalari nerede olusturacagimiizi belirler ve boylece toplu calismayi kolaylastirir.
               Her framework dosya duzeni olusturmanin yaninda islerimizi kolaylastiran yeni ozellikler sunmustur.

               JUinit framework en temel test frameworkudur.
               Bize kazandirdigi en onemli ozellik @test Annotation (Notasyon)'dir.
              Test Notasyonu sayesinde her bir method bagimsiz olarak calistirilabilen test methodu olur.

                 @Test notasyonu sayesinde istersek herbir test method'unu bagimsiz calistirabildigimiz gibi
                   istenirse class level'dan calistirip,
                    tum testlerin calismasini saglayabiliriz
                    JUnit framework'de test method'larinin hangi sira ile calisacagini
                    ONGOREMEYIZ ve KONTROL EDEMEYIZ
     */
    @Test
    public void test01() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://www.amazon.com");

    }

    @Test
    public void test02() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.wisequarter.com");
    }
    @Test
    public void test03() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.youtube.com");
        driver.quit();
    }


}