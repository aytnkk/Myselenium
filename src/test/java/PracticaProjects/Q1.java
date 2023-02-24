package PracticaProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q1 {
    public static void main(String[] args) {
        /*...Exercise1...
    Create a new class under Q1 create main method
    1-Set Path :paht'set et.
    2- Create chrome driver
    3-Maximize the window
    4-Open google home page https://www.google.com/.
    5- On the same class, Navigate to amazon home page https://www.amazon.com/
    6-Navigate back to google
    7- Navigate forward to amazon
    8-Refresh the page
    9- Close/Quit the browser
    10- And last step : print "All Ok" on console:Ve son adım: konsolda "All Ok" yazdırın
     */

       // 1-Set Path :paht'set et.
        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver_win32.exe");
       // 2- Create chrome driver
       // 3-Maximize the window
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       //4-Open google home page https://www.google.com/.

       driver.get("https://www.google.com/");
       //get methodu daha hizli calisir.navigate methodu ise bagimli senoryalarda calistirilir

       // 5- On the same class, Navigate to amazon home page https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com ");

        //  6-Navigate back to google
        driver.navigate().back();

        //  7- Navigate forward to amazon
        driver.navigate().forward();

        //  8-Refresh the page
        driver.navigate().refresh();

        //  9- Close/Quit the browser
       // driver.close();
        driver.quit();

        // 10- And last step : print "All Ok" on console
        System.out.println("All Ok");
    }

}
