import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GreenKart {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(10));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[3]/button[1]")).click();
        driver.findElement(By.xpath("//header/div[1]/div[3]/a[4]/img[1]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

        driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]")).sendKeys("India");
        driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();

    }
}
