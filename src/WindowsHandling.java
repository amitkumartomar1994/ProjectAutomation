import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowsHandling {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
        Set<String> windows= driver.getWindowHandles();
        Iterator<String>it = windows.iterator();
        String parent = it.next();
        String child = it.next();
        driver.switchTo().window(child);
        System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
        }
    }

