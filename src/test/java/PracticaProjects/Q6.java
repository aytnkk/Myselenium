package PracticaProjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q6 {
    @BeforeClass
    public static void setup(){
        System.out.println("before class calisti");
    }
    @AfterClass
    public static void tearnDown(){
        System.out.println("after class cslisti");
    }
    @Before
    public void before(){
        System.out.println("before calisti");
    }
    @After
    public void after(){
        System.out.println("after calisti");
    }
@Test
    public void ahmet(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    System.out.println("AHMET");
}
@Test
    public void bekir(){
    System.out.println("bekir");
}
@Test
    public void cengiz(){
    System.out.println("cengiz");
}
}
