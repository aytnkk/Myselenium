package PracticaProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {
    public static void main(String[] args) {
        /* ...Exercise2...
 1 - Driver olusturalim
 2 - Java class'imiza chromedriver.exe'yi tanitalim
 3 - Driver'in tum ekrani kaplamasini saglayalim
 4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
     söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
 5 - "https://www.otto.de" adresine gidelim
 6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
 7 - Title ve url'nin "OTTO" kelimesinin icerip icermedigini kontrol edelim
 8 - Ardindan "https://wisequarter.com/" adresine gidelim
 9 - Bu adresin basligini alalim ve "Quarter" kelimesini icerip icermedigini
     kontrol edelim
 10- Bir onceki web sayfamiza geri donelim
 11- Sayfayi yenileyelim
 12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
 13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */

     //  1 - Driver olusturalim
     //  2 - Java class'imiza chromedriver.exe'yi tanitalim
     //  3 - Driver'in tum ekrani kaplamasini saglayalim
     //  4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
     //  söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
     //
        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_win32.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        //5 - "https://www.otto.de" adresine gidelim
        driver.get("https://www.otto.de");

        // 6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
        driver.getTitle();
        driver.getCurrentUrl();

        // 7 - Title ve url'nin "OTTO" kelimesinin icerip icermedigini kontrol edelim
        String expectedTitle= driver.getTitle();
        System.out.println("expectedTitle = " + expectedTitle);

        String actualUrl=driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

       if (expectedTitle.contains("OTTO") && actualUrl.contains("OTTO")){
           System.out.println("OTTO yazisi vardir");
       }else{
           System.out.println("OTTO yazisi yoktur");
       }

         //8 - Ardindan "https://wisequarter.com/" adresine gidelim
        driver.navigate().to("https://wisequarter.com");

        // 9 - Bu adresin basligini alalim ve "Quarter" kelimesini icerip icermedigini
        //     kontrol edelim
        String actualTitle1=driver.getTitle();
        System.out.println("actualTitle1 = " + actualTitle1);

        boolean isTrue=actualTitle1.contains("Quarter");
        //System.out.println(isTrue?"Test Passed":"Test Failed"); ternaary cozumu
        if (isTrue){
            System.out.println("title testi passed");
        }else{
            System.out.println("title testi failed");
        }
      // 10- Bir onceki web sayfamiza geri donelim
        driver.navigate().back();

      // 11- Sayfayi yenileyelim
        driver.navigate().refresh();

      // 12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        driver.navigate().forward();

      // 13- En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();
    }
}
