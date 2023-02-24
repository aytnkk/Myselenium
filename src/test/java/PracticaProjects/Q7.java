package PracticaProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q7 {
    // .......Exercise5........
    /*
    Navigate to website https://testpages.herokuapp.com/styled/index.html
    Under the ORIGINAL CONTENTS
    click on Alerts
    print the URL
    navigate back
    print the URL
    Click on Basic Ajax
    print the URL
    enter value 20 and ENTER
    and then verify Submitted Values is displayed open page
    close driver
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "drivers/chromedriver_win32");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Navigate to website https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        // Under the ORIGINAL CONTENTS
        // click on Alerts
        driver.findElement(By.xpath("//h2[text()='Original Contents']"));
        driver.findElement(By.xpath("//a[@id='alerts']")).click();

        // print the URL

        String expectedUrl = "https://testpages.herokuapp.com/styled/index.html";
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);

        // navigate back
        driver.navigate().back();
        Thread.sleep(2);
        // print the URL

        // Click on Basic Ajax
        driver.findElement(By.xpath("//a[@id='basicajax']")).click();


        // enter value 20 and ENTER
        driver.findElement(By.id("lteq30")).sendKeys("20" + Keys.ENTER);

        // and then verify Submitted Values is displayed open page
       WebElement submitted_values= driver.findElement(By.xpath("//*[text()='Processed Form Details']"));

        if (submitted_values.isDisplayed()){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }
            // close driver
            driver.close();
        }
    }

