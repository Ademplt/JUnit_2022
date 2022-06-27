package day10_actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Ubung extends TestBase {
    /*
    1) Bir class oluşturun: BestBuyAssertions
2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak asagidaki
testleri yapin
○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
○ logoTest => BestBuy logosunun görüntülendigini test edin
○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
     */

    @Test
    public void test01() {
        //○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
        driver.get("https://www.bestbuy.com/");
        String expectedUrl = "https://www.bestbuy.com/";
        String actualUrl =driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void test02() {
        //○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin○ titleTest
        // => Sayfa başlığının “Rest” içermediğini(contains) test edin
        String expectedWord="Rest";
        String actualTitle=driver.getTitle();
        Assert.assertFalse(actualTitle.contains(expectedWord));
    }

    @Test
    public void test03() {
        //○ logoTest => BestBuy logosunun görüntülendigini test edin
        driver.get("https://www.bestbuy.com/");
      WebElement logo= driver.findElement(By.xpath("//img[@class='logo']"));
      Assert.assertTrue(logo.isDisplayed());
    }
    @Test
    public void test04() {
        //○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
        driver.get("https://www.bestbuy.com/");
        WebElement link= driver.findElement(By.xpath("//*[text()='Français']"));
        Assert.assertTrue(link.isDisplayed());
    }
}
