package PracticaProjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class soru {

    // 1. Launch browser
    static WebDriver driver;

    @BeforeClass
    public static void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @AfterClass
    public static void teardown() {
        driver.close();
    }

    @Test
    public void test01() {
        //  2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        // 3. Verify that home page is visible successfully
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("automationexercise"));
    }

    @Test
    public void test02() {
        // 4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();
    }

    @Test
    public void test03() {
        // 5. Verify 'New User Signup!' is visible
        WebElement usersihnup = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
        Assert.assertTrue(usersihnup.isDisplayed());

    }

    @Test
    public void test04() {
        // 6. Enter name and email address

        driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("ayten" + Keys.ENTER);
        driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]")).sendKeys("aydemkk2@gmail.com" + Keys.ENTER);
        // 7. Click 'Signup' button

    }

    @Test
    public void test07() {
        // 8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enter = driver.findElement(By.xpath("(//h2[@class='title text-center'])[1]"));
        Assert.assertTrue(enter.isDisplayed());
    }

    @Test
    public void test08() {
        // 9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.cssSelector("#id_gender2")).getText();
        driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).getText();
        driver.findElement(By.cssSelector("#password")).sendKeys("12345" + Keys.ENTER);

        driver.findElement(By.xpath("//input[@id='newsletter']")).click();

        // 11. Select checkbox 'Receive special offers from our partners!'
        driver.findElement(By.xpath("//input[@id='optin']")).click();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        driver.findElement(By.cssSelector("#first_name")).sendKeys("ay" + Keys.ENTER);
        driver.findElement(By.cssSelector("#last_name")).sendKeys("kk" + Keys.ENTER);
        driver.findElement(By.cssSelector("#company")).sendKeys("wisequarter" + Keys.ENTER);
        driver.findElement(By.cssSelector("#address1")).sendKeys("aysekurkfhsudj" + Keys.ENTER);
        driver.findElement(By.cssSelector("#country")).sendKeys("india" + Keys.ENTER);
        driver.findElement(By.cssSelector("#state")).sendKeys("marako" + Keys.ENTER);
        driver.findElement(By.cssSelector("#city")).sendKeys("lenting" + Keys.ENTER);
        driver.findElement(By.cssSelector("#zipcode")).sendKeys("87104" + Keys.ENTER);
        driver.findElement(By.cssSelector("#mobile_number")).sendKeys("08746545346478" + Keys.ENTER);
// 13. Click 'Create Account button'
        WebElement button = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
        button.click();
// 14. Verify that 'ACCOUNT CREATED!' is visible
        Assert.assertTrue(button.isDisplayed());

        // 15. Click 'Continue' button
driver.findElement(By.xpath("//*[text()='Continue']")).click();

// 16. Verify that 'Logged in as username' is visible
       WebElement logged= driver.findElement(By.xpath("//b[text()='Adem']"));
       Assert.assertTrue(logged.isDisplayed());
// 17. Click 'Delete Account' button
        WebElement delete=driver.findElement(By.linkText("delete account"));
        delete.click();
// 18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        Assert.assertTrue(delete.isDisplayed());
        driver.findElement(By.xpath("//*[text()='Continue']")).click();
    }

}