package tekrarlar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class zeroTesti extends TestBase {
    @Test
    public void test01() {

        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
        //2. Signin buttonuna tiklayin
        driver.findElement(By.id("signin_button")).click();
        //3. Login alanine  “username” yazdirin
        driver.findElement(By.id("user_login")).sendKeys("username");
        //4. Password alanina “password” yazdirin
        driver.findElement(By.id("user_password")).sendKeys("password");
        //5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        // sayfa acilamazsa back tusuna basin
        driver.navigate().back();
        //6. Online Banking menusunden Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        driver.findElement(By.xpath("//span[text()='Pay Bills']")).click();
//        7. “Purchase Foreign Currency” tusuna basin
        driver.findElement(By.xpath("//a[text()='Purchase Foreign Currency']")).click();
//        8. “Currency” drop down menusunden Eurozone’u secin
        WebElement ddm = driver.findElement(By.id("pc_currency"));
        Select select = new Select(ddm);
        select.selectByVisibleText("Eurozone (euro)");
//        9. “amount” kutusuna bir sayi girin
        driver.findElement(By.id("pc_amount")).sendKeys("200");
//        10. “US Dollars” in secilmedigini test edin
        WebElement usdolar = driver.findElement(By.id("pc_inDollars_true"));
        Assert.assertFalse(usdolar.isSelected());
//        11. “Selected currency” butonunu secin
        driver.findElement(By.id("pc_inDollars_false")).click();
//        12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
        driver.findElement(By.id("pc_calculate_costs")).click();
        driver.findElement(By.id("purchase_cash")).click();
//        13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini test edin
        WebElement foreing = driver.findElement(By.id("alert_content"));
        Assert.assertTrue(foreing.isDisplayed());
    }
}