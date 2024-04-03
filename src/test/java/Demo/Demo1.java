package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {


    @Test
    public void test1(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        System.out.println("şu an ki URL "+driver.getCurrentUrl());
        System.out.println("sayfanın başlığı "+driver.getTitle());



    }
}
