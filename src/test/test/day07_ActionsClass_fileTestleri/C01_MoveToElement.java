package day07_ActionsClass_fileTestleri;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C01_MoveToElement extends TestBase {
//1- https://www.amazon.com/ adresine gidin
//2- Sag ust bolumde bulunan “Account & Lists” menusunun acilmasi icin mouse’u bu menunun ustune getirin
//3- “Create a list” butonuna basin
//4- Acilan sayfada “Your Lists” yazisi oldugunu test edin


    @Test
    public void testo1(){
        //1- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/ ");

        //2- Sag ust bolumde bulunan “Account & Lists” menusunun acilmasi icin mouse’u bu menunun ustune getirin
       WebElement accountListElementi= driver.findElement(By.xpath("//span[text()='Account & Lists']"));

        Actions actions=new Actions(driver);
        actions.moveToElement(accountListElementi).perform();

        //3- “Create a list” butonuna basin
        driver.findElement(By.xpath("//*[text()='Create a List']")).click();



        //4- Acilan sayfada “Your Lists” yazisi oldugunu test edin
        WebElement yourListsElementi= driver.findElement(By.id("my-lists-tab"));
        Assert.assertTrue(yourListsElementi.isDisplayed());
        bekle(4);
    }
}
