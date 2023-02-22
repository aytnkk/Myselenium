package day07_ActionsClass_fileTestleri;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FilePath {
    @Test
    public void test01(){
        // C:\Users\Ayten\Desktop\delta
        // C:\Users\Ayten\Desktop\seleniumteam108\src\test\java\day07_ActionsClass_fileTestleri\C06_FileExistTesti.java
          /*
            Bilgisayarimizda bir dosyanin var oldugunu test etmek icin
            dosya yoluna ihtiyacimiz var
            Ancak herkesin bilgisayarindaki dosya yollari
            farkliliklar gosterir
            herkesin bilgisayarina gore farkli olan kismi
            java'dan bir komut ile elde edebiliriz
         */

        String dosyaYolu="C:\\Users\\Ayten\\Desktop\\delta";
         boolean sonuc= Files.exists(Paths.get(dosyaYolu));
        System.out.println(sonuc);


        System.out.println(System.getProperty("user.home"));
       dosyaYolu= "C:\\Users\\Ayten\\Desktop\\delta";
       dosyaYolu=System.getProperty("user.home")+"\\Desktop\\delta";

        System.out.println(System.getProperty("user.dir"));
        //C:\Users\Ayten\Desktop\seleniumteam108

    }
}
