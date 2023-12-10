import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DatesHAndling {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companion/");
        driver.findElement(By.xpath("//input[@name='form_fields[travel_comp_date]']")).click();
        //May 31, 2023
       // List<WebElement> dates=driver.findElements(By.cssSelector(".flatpickr-day "));
        //System.out.println(dates.size());
    }
}
