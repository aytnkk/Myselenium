package AutomationExersiceSorulari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class soru7 extends TestBase {

    @Test
    public void test01(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        String expectedUrl="https://automationexercise.com/";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        //4. Click on 'Test Cases' button
        WebElement testCases= driver.findElement(By.xpath("//a[.=' Test Cases']"));
        testCases.click();
        //5. Verify user is navigated to test cases page successfully
        Assert.assertTrue(testCases.isDisplayed());
    }
}

