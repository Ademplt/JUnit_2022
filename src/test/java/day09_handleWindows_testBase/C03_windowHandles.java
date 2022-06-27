package day09_handleWindows_testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_windowHandles {

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
        driver.quit();
    }
    @Test
    public void test01(){
        //● Tests package’inda yeni bir class olusturun: WindowHandle2
//● https://the-internet.herokuapp.com/windows adresine gidin.
driver.get("https://the-internet.herokuapp.com/windows");
//● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        WebElement sayfa= driver.findElement(By.xpath(""));
//● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
//● Click Here butonuna basın.
//● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
//● Sayfadaki textin “New Window” olduğunu doğrulayın.
//● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.


    }
}
