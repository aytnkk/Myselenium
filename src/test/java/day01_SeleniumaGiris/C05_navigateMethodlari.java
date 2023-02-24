package day01_SeleniumaGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_navigateMethodlari {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

       // wisequarter.com anasayfasina  gidin
        driver.get("https://www.wisequarter.com");

        // amazon.com anasayfasina donun
        driver.get("https://www.amazon.com");

        //  yeniden wisequarter sayfasina donun
        driver.navigate().back();

        // yeniden amazona gidin
        driver.navigate().forward();

        // navigate().to() , driver.get() ile ayni isi yapar
        driver.navigate().to("https://www.youtube.com");

        driver.navigate().refresh(); // sayfayi yeniler

       driver.close();

    }
}
