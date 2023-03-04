package day09_excel_schreenshot_jsExecutor;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C03_WriteExcel {
    @Test
    public void test01() throws IOException {
       //  2) Yeni bir test method olusturalim writeExcelTest()

        String dosyaYolu="src/test/java/day09_excel_schreenshot_jsExecutor/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook workBook= WorkbookFactory.create(fis);
        Sheet sheet=workBook.getSheet("Sayfa1");

        //  3) Adimlari takip ederek 1.satira kadar gidelim
       //  4) 4.hucreye yeni bir cell olusturalim
        //  5) Olusturdugumuz hucreye “Nufus” yazdiralim
        sheet.getRow(0).createCell(4).setCellValue("Nufus");
        //  6) 2.satir nufus kolonuna 1500000 yazdiralim
        sheet.getRow(1).createCell(4).setCellValue("1500000");
       //  7) 10.satir nufus kolonuna 250000 yazdiralim
        sheet.getRow(9).createCell(4).setCellValue("250000 ");
       //  8) 15.satir nufus kolonuna 54000 yazdiralim
        sheet.getRow(14).createCell(4).setCellValue("54000");
       //  9) Dosyayi kaydedelim
        FileOutputStream fos=new FileOutputStream(dosyaYolu);
        workBook.write(fos);
       //  10)Dosyayi kapatalim
        fis.close();
        fos.close();
        workBook.close();
    }
}
