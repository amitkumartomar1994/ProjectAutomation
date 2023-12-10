import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
        WebElement pass = driver.findElement(By.xpath("//input[@id=\"pass\"]"));

        if (email.isDisplayed() && email.isEnabled()) {
            email.sendKeys("amit.kumar@gmail.com");
        }

        if (pass.isDisplayed() && pass.isEnabled()) {
            pass.sendKeys("amit@142");
        }


    }       }