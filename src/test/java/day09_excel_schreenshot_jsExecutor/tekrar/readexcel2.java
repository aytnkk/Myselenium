package day09_excel_schreenshot_jsExecutor.tekrar;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class readexcel2 {

    @Test
    public void test01() throws IOException {
       String dosyaYolu="src/test/java/day09_excel_schreenshot_jsExecutor/ulkeler.xlsx" ;
        FileInputStream fis=new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fis);

        // - 1.satirdaki 2.hucreye gidelim ve yazdiralim
        System.out.println(workbook.getSheet("Sayfa1").getRow(0).getCell(1));

        // - 1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim
        String istenenData=workbook.getSheet("Sayfa1").getRow(0).getCell(1).toString();
        System.out.println("istenen data:" + istenenData);


        // - 2.satir 4.cell’in afganistan’in baskenti oldugunu test edelim
        String actualData=workbook.getSheet("sayfa1").getRow(1).getCell(3).toString();
        String expectedData="Kabil";
        Assert.assertEquals(expectedData,actualData);

        // - Satir sayisini bulalim
        System.out.println("satri sayisi:" +(workbook.getSheet("sayfa1").getLastRowNum()+1));

        // - Fiziki olarak kullanilan satir sayisini bulun
        System.out.println("sayfa2 satir sayisi:" +(workbook.getSheet("sayfa2").getLastRowNum()+1));
        System.out.println("sayfa2 fiziki olarak kullanilan:" +(workbook.getSheet("sayfa2").getPhysicalNumberOfRows()));

        //  - Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim
        Map<String,String> ulkelerMap=new TreeMap<>();
        int sonSatirIndex=workbook.getSheet("sayfa1").getLastRowNum();

        for (int i = 1; i <=sonSatirIndex ; i++) {
            String keyUlke=workbook.getSheet("sayfa1").getRow(i).getCell(0).toString();
            String valueBaskent=workbook.getSheet("sayfa1").getRow(i).getCell(1).toString();

            ulkelerMap.put(keyUlke,valueBaskent);
        }
        System.out.println(ulkelerMap);
        System.out.println("=============");
        Set<Map.Entry<String,String>> ulkelerEntrySeti=ulkelerMap.entrySet();
        for (Map.Entry<String,String> eachentry:ulkelerEntrySeti
             ) {
            System.out.println(eachentry);

        }
    }
}
