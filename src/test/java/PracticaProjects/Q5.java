package PracticaProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q5 {
    /* ...Exercise4...
Navigate to  https://testpages.herokuapp.com/styled/index.html
Click on  Calculater under Micro Apps
Type any number in the first input
Type any number in the second input
Click on Calculate
Get the result
Print the result
     */
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_win32");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

      // Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get(" https://testpages.herokuapp.com/styled/index.html");

      // Click on  Calculater under Micro Apps
      driver.findElement(By.id("calculatetest")).click();

      // Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("javanin kalbi nerde?"+ Keys.ENTER);

      // Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("hallo world"+Keys.ENTER);

      // Click on Calculate
      driver.findElement(By.id("calculate")).click();

      // Get the result
        WebElement result=driver.findElement(By.cssSelector("#answer"));


      // Print the result
        System.out.println("result:" + result);

    driver.close();
    }
}
