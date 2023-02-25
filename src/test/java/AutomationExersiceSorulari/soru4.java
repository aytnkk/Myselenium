package AutomationExersiceSorulari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class soru4 extends TestBase {
@Test
    public void test01(){







    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    driver.get("http://automationexercise.com");
    //3. Verify that home page is visible successfully
    String expectedUrl="http://automationexercise.com";
    String actualUrl=driver.getCurrentUrl();
    //4. Click on 'Signup / Login' button


    driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();

    //5. Verify 'New User Signup!' is visible
    WebElement login=driver.findElement(By.cssSelector("h2"));
    Assert.assertTrue(login.isDisplayed());

    //6. Enter name and already registered email address
    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("ahmet");
    driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("ahmet@gmail.com");
    //7. Click 'Signup' button
    driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
    //8. Verify error 'Email Address already exist!' is visible
    WebElement error=driver.findElement(By.xpath("//p[text()='Email Address already exist!']"));
    Assert.assertTrue(error.isDisplayed());
}
}
