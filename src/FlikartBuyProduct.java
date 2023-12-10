import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class FlikartBuyProduct {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("boat earphones rockerz 255 pro"+ Keys.ENTER);
        driver.findElement(By.cssSelector(".s1Q9rs")).click();
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> it =windows.iterator();
        String parent = it.next();
        String child = it.next();
        driver.switchTo().window(child);
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")).click();
        driver.switchTo().window(parent);
        driver.findElement(By.linkText("Contact Us")).click();

    }
}
