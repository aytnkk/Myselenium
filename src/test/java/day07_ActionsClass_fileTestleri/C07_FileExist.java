package day07_ActionsClass_fileTestleri;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C07_FileExist {


    @Test
    public void test01(){
        // Calistigimiz package icerisinde
        // text.txt isimli bir file oldugunu test edin
        String dinamikDosyaYolu = System.getProperty("user.dir")
                +"/src/test/test/day07_ActionsClass_fileTestleri/text.txt";
        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));
    }
    }