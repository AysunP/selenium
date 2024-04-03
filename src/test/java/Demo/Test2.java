package Demo;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test2 {
    @Test
    public void testFunction(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.trendyol.com/");

        driver.getCurrentUrl();
        System.out.println("Web sitesiniz urli: " + driver.getCurrentUrl());

        String webtitle = driver.getTitle();
        System.out.println(webtitle);
        driver.close();
    }

    @Test
    public void test1Function() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://eczapro.net/main-page");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
        driver.findElement(By.className("modal-img-close")).click();
    }

    @Test
    void name() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.trendyol.com/");
        WebElement close = driver.findElement(By.id("Combined-Shape"));
        close.click();
        WebElement search = driver.findElement(By.xpath("//input[@data-testid='suggestion']"));
        search.sendKeys("ayak kremi", Keys.ENTER);
        WebElement results = driver.findElement(By.xpath("//div[@class='dscrptn dscrptn-V2']"));
        System.out.println(results.getText());
    }
}
