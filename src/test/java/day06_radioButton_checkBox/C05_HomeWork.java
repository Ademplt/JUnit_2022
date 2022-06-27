package day06_radioButton_checkBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_HomeWork {
    /*
    1.Yeni bir class olusturalim (Homework)
2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
yazdirin.
4.https://www.walmart.com/ sayfasina gidin.
5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
6. Tekrar “facebook” sayfasina donun
7. Sayfayi yenileyin
8. Sayfayi tam sayfa (maximize) yapin
9.Browser’i kapatin
     */
  WebDriver driver;
    @Before
    public void setUp(){
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){
        driver.close();
    }
    @Test
    public void test01(){
        driver.get("https://www.facebook.com");
     String actualTitel= driver.getTitle();
     String expected="facebook";

      Assert.assertFalse(actualTitel.contains(expected));
        System.out.println("actual titel :"+  driver.getTitle());

    }
    @Test

    public void test02(){
        driver.navigate().to("https://www.walmart.com/");
        String expectedTitel="Walmart.com";
        String actualTitel= driver.getTitle();
        Assert.assertTrue("Test PASSED",actualTitel.contains(expectedTitel));

    }
    @Test
    public void test03(){
        driver.navigate().back();
        driver.navigate().refresh();

    }
}
