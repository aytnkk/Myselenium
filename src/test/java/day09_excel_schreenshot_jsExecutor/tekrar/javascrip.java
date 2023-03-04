package day09_excel_schreenshot_jsExecutor.tekrar;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class javascrip extends TestBase {
    @Test
    public void test01() {
        // wisequarter anqsayfasina gidelim
        driver.get("https://www.wisequarter.com");
        //refresh diyerek reklami gecin
        driver.navigate().refresh();
        //java test otomation tanitimina kadar asagi inin
        WebElement otomationElementi = driver.findElement(By.xpath("(//img[@alt='Automation Engineer'])[1]"));
        bekle(5);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", otomationElementi);
        // ve resmi click yapin
        bekle(3);
        js.executeScript("arguments[0].click();", otomationElementi);
        bekle(2);
        // ekrana "JUnit bitti " yazdirin
        js.executeScript("alert('JUnit bitti');");


    }
}