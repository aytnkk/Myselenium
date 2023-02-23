package tekrarlar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_ders {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_win32.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");


        // arama kutusuna java yazip aratin
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("java");
        aramaKutusu.submit();

        // arama sonuclarinda cikan resimlerdeki yazilari yazdirin
        List<WebElement> aramasonuclari=driver.findElements(By.className("sg-col-inner"));
        System.out.println(aramasonuclari.size());

        // bu 82 elementi yazdiralim
        int elementNo=1;
        for (WebElement eachElement:aramasonuclari
             ) {
            System.out.println(elementNo + "---" + eachElement.getText());
            elementNo++;
        }

        Thread.sleep(3000);
        driver.close();

    }
}
