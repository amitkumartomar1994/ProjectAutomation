import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlrtsHandling {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.id("name")).sendKeys("amit");
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        driver.close();
        driver.quit();

    }
}
