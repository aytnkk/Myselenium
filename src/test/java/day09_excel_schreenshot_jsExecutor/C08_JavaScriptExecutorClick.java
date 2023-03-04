package day09_excel_schreenshot_jsExecutor;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C08_JavaScriptExecutorClick extends TestBase {
    @Test
    public void test01(){
        // wisequarter anqsayfasina gidelim
        driver.get("https://www.wisequarter.com");
        //refresh diyerek reklami gecin
        driver.navigate().refresh();
        //java test otomation tanitimina kadar asagi inin
      WebElement otomationElementi= driver.findElement(By.xpath("(//img[@alt='Automation Engineer'])[1]"));
bekle(5);
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();",otomationElementi);

        // ve resmi click yapin
        bekle(3);
    jse.executeScript("arguments[0].click();",otomationElementi);
bekle(2);
        // ekrana "JUnit bitti " yazdirin
        jse.executeScript("alert('Junit bitti');");
        bekle(7);
    }
}
