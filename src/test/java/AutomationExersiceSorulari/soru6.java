package AutomationExersiceSorulari;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class soru6 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        String expectedUrl="http://automationexercise.com";
        String actualUrl=driver.getCurrentUrl();
        //4. Click on 'Contact Us' button
        driver.findElement(By.xpath("//a[@href='/contact_us']")).click();
        //5. Verify 'GET IN TOUCH' is visible
        WebElement touch=driver.findElement(By.xpath("(//h2[@class='title text-center'])[1]"));
        Assert.assertTrue(touch.isDisplayed());
        //6. Enter name, email, subject and message
        WebElement bilgiKutusu=driver.findElement(By.xpath("//input[@name='name']"));
        Actions action=new Actions(driver);
        Faker faker=new Faker();

        action.click(bilgiKutusu)
                .sendKeys(faker.name().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.job().title())
                .sendKeys(Keys.TAB)
               .sendKeys("selenium cok ilginc")
                       .sendKeys(Keys.TAB).perform();

        bekle(5);

        //7. Upload file
        String dinamikDosyaYolu= System.getProperty("user.home")+"/Downloads/logo.png";
        WebElement chooseFileButonu= driver.findElement(By.name("upload_file"));
        chooseFileButonu.sendKeys(dinamikDosyaYolu);

         bekle(10);
        //8. Click 'Submit' button
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        //9. Click OK button
        driver.switchTo().alert().accept();

        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        WebElement success=driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
        Assert.assertTrue(success.isDisplayed());
        //11. Click 'Home' button and verify that landed to home page successfully
        WebElement home=driver.findElement(By.xpath("//a[@class='btn btn-success']"));
        home.click();

     driver.navigate().refresh();

        WebElement homePage= driver.findElement(By.xpath("(//a[@href='/'])[2]"));
        Assert.assertTrue(homePage.isDisplayed());

        //driver.findElement(By.xpath("//span[.=' Home']")).click();
        //Assert.assertEquals(expectedUrl,actualUrl);





    }
}
