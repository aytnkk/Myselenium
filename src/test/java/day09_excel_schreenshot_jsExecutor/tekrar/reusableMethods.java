package day09_excel_schreenshot_jsExecutor.tekrar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class reusableMethods {
    public static void tumsayfascreenshot(WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddhhmmss");
        String dinaminDosyaYolu = "target/tumsayafass" + ldt.format(dtf) + ".png";
        File tumsayfass = new File(dinaminDosyaYolu);
        File geciciFile = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(geciciFile, tumsayfass);
        } catch (IOException e) {
        }
    }

    public static void WebElementScreenshot(WebElement istenenelement) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddhhmmss");
        String dinaminDosyaYolu = "target/tumsayafass" + ldt.format(dtf) + ".png";

        File elementss = new File(dinaminDosyaYolu);
        File geciciDosya = istenenelement.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(geciciDosya, elementss);
        } catch (IOException e) {

        }
    }
}