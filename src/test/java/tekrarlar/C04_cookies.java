package tekrarlar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class C04_cookies extends TestBase {
    @Test
    public void test01(){

        // 1- Amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        // 2- tum cookie’leri listeleyin
        Set<Cookie> cookies=driver.manage().getCookies();
        int siraNo=1;
        for (Cookie each:cookies
             ) {
            System.out.println(siraNo + "-" +each);
            siraNo++;
        }
        // 3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        Assert.assertTrue(cookies.size()>5);
        // 4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
        String actualcookie=driver.manage().getCookieNamed("i18n-prefs").getValue();
        String expectedcookie="USD";
        Assert.assertEquals(expectedcookie,actualcookie);
        // 5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun ve sayfaya ekleyin
        Cookie benimCookie=new Cookie("bnim en sevdigim cooike","cikilatali");
        driver.manage().addCookie(benimCookie);
        cookies=driver.manage().getCookies();
        siraNo=1;
        for (Cookie each:cookies
             ) {
            System.out.println(siraNo + " -"+each.toString());
            siraNo++;
        }
        // 6- eklediginiz cookie’nin sayfaya eklendigini test edin
        String expectedcookies="cikilatali";
        String actualcikoi=driver.manage().getCookieNamed("bnim en sevdigim cooike").getValue();
        Assert.assertEquals(actualcikoi,expectedcookies);

        // 7- ismi skin olan cookie’yi silin ve silindigini test edin
        driver.manage().deleteCookieNamed("skin");
        cookies=driver.manage().getCookies();
        for (Cookie eachcookies:cookies
             ) {
            Assert.assertFalse(eachcookies.getName().equals("skin"));
        }
        // 8- tum cookie’leri silin ve silindigini test edin

        driver.manage().deleteAllCookies();
        cookies=driver.manage().getCookies();
        Assert.assertTrue(cookies.size()==0);
    }
}
