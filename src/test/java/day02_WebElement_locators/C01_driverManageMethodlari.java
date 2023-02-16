package day02_WebElement_locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.drive","drivers/chromedriver_win32.exe");
        WebDriver driver=new ChromeDriver();

        System.out.println("ilk size :" + driver.manage().window().getSize());
        System.out.println("ilk position : " + driver.manage().window().getPosition());

        //olculeri ve konumu degistirebiliriz
        driver.manage().window().setSize(new Dimension(500,500));
        driver.manage().window().setPosition(new Point(40,100));






        Thread.sleep(2000);
        driver.close();



    }
}
