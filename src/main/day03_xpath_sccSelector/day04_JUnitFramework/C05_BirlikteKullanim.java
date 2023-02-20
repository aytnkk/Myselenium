package day03_xpath_sccSelector.day04_JUnitFramework;

import org.junit.*;

public class C05_BirlikteKullanim {

    @BeforeClass

    public static void beforeClassMethodu() {
        System.out.println("Before class calisti \n---------------");

    }

    @AfterClass
    public static void afterClass() {
        System.out.println("after class calisti\n-------");
    }

    @Before
    public void before() {
        System.out.println("\nBefore methodu calisti\n========");
    }

    @After
    public void after() {
        System.out.println("After methodu calisti\n============");

    }

    @Test
    public void test01() {
        System.out.println("test01 calisti");
    }

    @Test
    public void test02() {
        System.out.println("test02calisti");
    }

    @Test
    public void test03() {
        System.out.println("test03 calisti");
    }
}

