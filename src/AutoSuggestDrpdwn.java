import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestDrpdwn {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

        //COUNT OF CHECKBOX IN THA PAGE
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

    }

}



