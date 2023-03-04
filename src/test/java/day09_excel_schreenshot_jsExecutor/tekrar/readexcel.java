package day09_excel_schreenshot_jsExecutor.tekrar;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class readexcel {
    @Test
    public void test01() throws IOException {
       String dosyaYolu="src/test/java/day09_excel_schreenshot_jsExecutor/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fis);

        //Bilgisayarimizdaki excel'in icinde bulunan tum bilgiler artik workbook objesinde kayitli
        //excel'in yapisi geregi sirayla,
        //-istenen sayfa
        //-istenen satir
        //-istenen hucre olusturulmalidir/olusturulmalidir

        //12.satirin 3.hucresinin "Azerbaycan" oldugunu test edin.

        Sheet sayfa1=workbook.getSheet("Sayfa1");
        Row row=sayfa1.getRow(11);
        Cell cell=row.getCell(3);
        System.out.println(cell);

        String actualData=cell.toString();
        String expectedData="Azerbaycan";
        Assert.assertEquals(expectedData,actualData);

    }
}
