package day09_excel_schreenshot_jsExecutor;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C06_ReusableMethods {
    public static void tumSayfascreenshot(WebDriver driver) throws IOException {

        TakesScreenshot ts=(TakesScreenshot) driver;
        LocalDateTime ldt=LocalDateTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyyMMddhhmmss");
        String dinamikDosyaYolu="target/tumSayfaSs" + ldt.format(dtf)+".png";
        //dosya Yolu "target/tumSayfaSs2023022714813"
        File tumsayfaSs=new File(dinamikDosyaYolu);
        File geciciFile=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciFile,tumsayfaSs);
    }
}
