package day08_ExplicitlyWait_cookies_webtable;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C06_WebTables extends TestBase {
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
        WebElement tumdata = driver.findElement(By.xpath("//div/div/div[2]/div[2]/div[2]/div[3]/div[1]"));
        System.out.println(tumdata.getText());


        System.out.println("---------------");


        //  5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin
        List<WebElement> satirlar = driver.findElements(By.xpath("//div[@class='rt-td']"));
        int sayac = 0;

        for (WebElement eachdolu : satirlar
        ) {
            if (!eachdolu.getText().isBlank()) {
                sayac++;

            }
            System.out.println(sayac);
        }
        //  6. Tablodaki satir sayisini yazdirin
        List<WebElement> satirsayisi = driver.findElements(By.xpath("//div[@role='rowgroup']"));
        System.out.println(satirsayisi.size());


        // 7. Tablodaki sutun sayisini yazdirin
        List<WebElement> sutunsayisi = driver.findElements(By.xpath("//div[@class='rt-resizable-header-content']"));
        System.out.println(sutunsayisi.size());
        // 8. Tablodaki 3.kolonu yazdirin
        for (int i = 0; i <= 3; i++) {

        }
        WebElement kolon3 = driver.findElement(By.xpath("//div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[\" + i + \"]/div/div[3]"));
        System.out.println(kolon3.getText());

        System.out.println("===========");
        // 9. Tabloda “First Name” i Kierra olan kisinin Salary’sini yazdirin
        for (WebElement each : satirlar
        ) {
            System.out.println(each.getText());

        }
        WebElement salary = driver.findElement(By.xpath("//div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[3]/div/div[5]"));
        System.out.println(salary.getText());


        // 10. Page sayfasinda bir method olusturun,
        // Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin
        System.out.println("---------------");
        System.out.println("istenen data : \n" + getData(1, 1));
    }

        public String getData ( int satirNo, int sutunNo){
            // 3.satir, 5.sutundaki bilgiyi yazdirin
            //        //tbody/tr[3]/td[5]
            String dataXpath = "//div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[" + sutunNo + "]/div/div[" + satirNo + "]";
            String istenenData = driver.findElement(By.xpath(dataXpath)).getText();
            return istenenData;

        }

    }

