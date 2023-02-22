package day07_ActionsClass_fileTestleri;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FilePath {
    @Test
    public void test01(){
       // C:\Users\Ayten\Desktop\delta

String dosyaYolu="C:\\Users\\Ayten\\Desktop\\delta";
boolean sonuc= Files.exists(Paths.get(dosyaYolu));
        System.out.println(sonuc);


        System.out.println(System.getProperty("user.home"));
    }
}
