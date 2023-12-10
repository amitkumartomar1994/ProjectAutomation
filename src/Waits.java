import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;


public class Waits {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(10));
        driver.get("https://www.hdfcbank.com/");
        driver.findElement(By.xpath("//div[@class='dropdown'][1]")).click();
       select = new Select(driver.findElement(By.xpath("//ul[@class='dropdown1 dropdown-menu']")));
    }

    public static Select select;
}
