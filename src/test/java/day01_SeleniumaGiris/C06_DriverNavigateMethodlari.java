package day01_SeleniumaGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_DriverNavigateMethodlari {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        System.out.println("maximize size:" + driver.manage().window().getSize()); //maximize size:(1382, 744)
        System.out.println("maximize position:" + driver.manage().window().getPosition());//(-8, -8)

        driver.manage().window().fullscreen();
        System.out.println("fullscreen size :" + driver.manage().window().getSize() );//1366, 768)
        System.out.println("fullscreen psition :" + driver.manage().window().getPosition() ); //(0, 0)

    }
}
