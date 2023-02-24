package PracticaProjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q4 {
    /* ...Exercise3...
    go to url : https://www.techlistic.com/p/selenium-practice-form.html

    fill the firstname:ilk adı doldurun
    fill the lastname:son adi
    check the gender
    check the experience
    fill the date
    choose your profession -> Automation Tester
    choose your tool -> Selenium Webdriver
    choose your continent -> Antartica
    choose your command  -> Browser Commands
    click submit button
 */


    public static void main(String[] args) throws InterruptedException {
        //    ...Exercise3...

        //    go to url : https://www.techlistic.com/p/selenium-practice-form.html
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(" https://www.techlistic.com/p/selenium-practice-form.html");

        //1. cookies click
        driver.findElement(By.xpath("//button[@id='ez-accept-all']")).click();

        //2. cookies refressh
        driver.navigate().refresh();

        //    fill the firstname
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Said");

        //    fill the lastname
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Özkan");

        //sayfayi assagiya kaydirma
        JavascriptExecutor javascript = (JavascriptExecutor)driver;
        javascript.executeScript("window.scrollBy(0,350)");Thread.sleep(3000);

        //    check the gender
        WebElement gender = driver.findElement(By.xpath("//b[text()='Gender']"));
        if (gender.isDisplayed()) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        //    check the experience
        WebElement experince=driver.findElement(By.xpath("//span[text()='Years of Experience']"));
        if (experince.isDisplayed()){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }

        //    fill the date
        driver.findElement(By.cssSelector("#datepicker")).sendKeys("18.02.2023");

        //    choose your profession -> Automation Tester
        driver.findElement(By.cssSelector("#profession-1")).click();

        //    choose your tool -> Selenium Webdriver
        driver.findElement(By.cssSelector("#tool-2")).click();

        //    choose your continent -> Antartica
        driver.findElement(By.xpath("//option[text()='Antartica']")).click();
        Thread.sleep(2000);

        //    choose your command  -> Browser Commands
        driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();
        Thread.sleep(2000);

        //scroll the page down
        javascript.executeScript("window.scrollBy(0,350)");
        Thread.sleep(2000);

        //    click submit button
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        driver.close();

        //  Thread.sleep(2000); sürelerini kendim görmek icin koydum. Normalde gerek yok.
    }
}
