package AutomationExersiceSorulari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class soru3 extends TestBase {

// 1. Launch browser

    @Test
    public void test01(){
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("https://automationexercise.com/");
    //3. Verify that home page is visible successfully
       String expectedUrl="https://automationexercise.com/";
       String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
   //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();
  //5. Verify 'Login to your account' is visible
        WebElement login=driver.findElement(By.tagName("h2"));
        Assert.assertTrue(login.isDisplayed());

   //6. Enter incorrect email address and password
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("aytek9@gmail.com" + Keys.ENTER);
       driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("1233455" + Keys.ENTER);

 //7. Click 'login' button
      driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
 //8. Verify error 'Your email or password is incorrect!' is visible
      WebElement inCorrcet=  driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']"));
Assert.assertTrue(inCorrcet.isDisplayed());
    }
}
