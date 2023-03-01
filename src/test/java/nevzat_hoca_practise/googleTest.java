package nevzat_hoca_practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class googleTest{


 @Before
 public void setUp(){
  WebDriverManager.chromedriver().setup();
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
 }
 @Test
 public void test01(){

// ilgili kurulumlari tamamlayalim
  // Kullanici https://www.google.com adresine gider
  // Kullanici cookies i kabul eder
// Arama Kutusuna karsilastirma yapmak istedigi para birimlerini girer
// Para birimlerinin karsilastirmasini alir
// Karsilastirilacak olan para biriminin 1.5 den kucuk oldugu test edilir

 }
}
