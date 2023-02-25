package day08_ExplicitlyWait_cookies_webtable;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C06_WbTables extends TestBase {
    @Test
    public void test01() {
        // 1. “https://demoqa.com/webtables” sayfasina gidin

        driver.get("https://demoqa.com/webtables");
        // 2. Headers da bulunan basliklari yazdirin
        WebElement hearElement = driver.findElement(By.xpath("//div[@class='rt-thead -header']"));
        System.out.println(hearElement.getText());

//  3. 3.sutunun basligini yazdirin
        WebElement baslik3 = driver.findElement(By.xpath("(//div[@class='rt-resizable-header-content'])[2]"));
        System.out.println(baslik3.getText());

        System.out.println("---------------");

        //  4. Tablodaki tum datalari yazdirin
        WebElement tumdata=driver.findElement(By.xpath("//div/div/div[2]/div[2]/div[2]/div[3]/div[1]"));
        System.out.println(tumdata.getText());
        String dataText=tumdata.getText();

        System.out.println("---------------");


        //  5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin
        List<WebElement> satirlar= driver.findElements(By.xpath("//div[@class='rt-td']"));
        int sayac=0;
        for (WebElement dolu:satirlar
        ) {
            if(!(dolu.getText().isBlank())){
                sayac++;
            }

        }
        System.out.println(sayac);

        //  6. Tablodaki satir sayisini yazdirin
        List<WebElement>satirsayisi=driver.findElements(By.xpath("//div[@role='rowgroup']"));
        System.out.println(((List<?>) satirsayisi).size());

        // 5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin
        // 6. Tablodaki satir sayisini yazdirin
        // 7. Tablodaki sutun sayisini yazdirin
        // 8. Tablodaki 3.kolonu yazdirin
        // 9. Tabloda “First Name” i Kierra olan kisinin Salary’sini yazdirin
        // 10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin
    }
}