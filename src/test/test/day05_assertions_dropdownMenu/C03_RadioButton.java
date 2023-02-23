package day05_assertions_dropdownMenu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_RadioButton {
    //  Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
    //  a. Verilen web sayfasına gidin.
    //  https://facebook.com
    //  b. Cookies’i kabul edin
    //  c. Create an account buton’una basin
    //  d. Radio button elementlerini locate edin ve size uygun olani secin
    //e-sectiginiz radio buttonun secili,otekilerin secili olmadigini test edin


    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01(){
        driver.get("https://facebook.com");
        //  b. Cookies’i kabul edin
driver.findElement(By.xpath("//button[@id='u_0_e_7V']")).click();
                //  c. Create an account buton’una basin
        driver.findElement(By.xpath("//*[text()='Create new account']")).click();
        //  d. Radio button elementlerini locate edin ve size uygun olani secin
        WebElement femaleElementi= driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        WebElement maleElementi= driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        WebElement customElementi= driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
        maleElementi.click();
        //  e. Sectiginiz radio button'un secili, otekilerin ise secili olmadigini test edin
        Assert.assertTrue(maleElementi.isSelected());
        Assert.assertFalse(femaleElementi.isSelected());
        Assert.assertFalse(customElementi.isSelected());
    }
}
