package AutomationExersiceSorulari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class soru8 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        String expectedUrl="https://automationexercise.com/";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        //4. Click on 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();

        //5. Verify user is navigated to ALL PRODUCTS page successfully
        WebElement produkt=driver.findElement(By.tagName("h2"));
        Assert.assertTrue(produkt.isDisplayed());
        bekle(2);
        if (driver.getCurrentUrl().equals("https://automationexercise.com/#google_vignette")){
            driver.navigate().refresh();
        }
        //6. The products list is visible
        WebElement list= driver.findElement(By.xpath("//div[@class='features_items']"));
        Assert.assertTrue(list.isDisplayed());
        Thread.sleep(500);
        //7. Click on 'View Product' of first product
        driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();

        //8. User is landed to product detail page
        String expected="https://automationexercise.com/product_details/1";
        String actual=driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        //9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
        WebElement details=driver.findElement(By.xpath("//div[@class='product-details']"));
        System.out.println(details.getText());
        Assert.assertTrue(details.isDisplayed());
    }
}
