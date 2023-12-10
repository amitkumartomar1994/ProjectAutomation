import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class TabsOpenGetTitle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement link = driver.findElement(By.xpath("//body[1]/div[6]/table[1]/tbody[1]/tr[1]/td[1]"));
        System.out.println(link.findElements(By.tagName("a")).size());
        for (int i = 1; i < link.findElements(By.tagName("a")).size(); i = i + 1) {
            String clicklink = Keys.chord(Keys.CONTROL, Keys.ENTER);
            link.findElements(By.tagName("a")).get(i).sendKeys(clicklink);

            Set<String> abc = driver.getWindowHandles();
            Iterator<String> it = abc.iterator();
            while (it.hasNext()) {
                driver.switchTo().window(it.next());
                System.out.println(driver.getTitle());
            }

        }
    }

}