package day09_excel_schreenshot_jsExecutor.tekrar;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeexcel {
    @Test
    public void test01() throws IOException {
        String dosyaYolu="src/test/java/day09_excel_schreenshot_jsExecutor/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook workBook= WorkbookFactory.create(fis);
        Sheet sheet=workBook.getSheet("sayfa1");

        //  3) Adimlari takip ederek 1.satira kadar gidelim
        //  4) 4.hucreye yeni bir cell olusturalim
        //  5) Olusturdugumuz hucreye “Nufus” yazdiralim
         sheet.getRow(0).createCell(4).setCellValue("nufus");
         sheet.getRow(1).getCell(4).setCellValue("12000");
         sheet.getRow(9).getCell(4).setCellValue("279900");
         sheet.getRow(14).getCell(4).setCellValue("53400");

        //  9) Dosyayi kaydedelim
        FileOutputStream fos=new FileOutputStream(dosyaYolu);
        workBook.write(fos);
        //  10)Dosyayi kapatalim
        fis.close();
        fos.close();
        workBook.close();





    }
}
