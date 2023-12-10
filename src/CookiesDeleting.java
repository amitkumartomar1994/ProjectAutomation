import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class CookiesDeleting {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().deleteCookieNamed("sessionkeys");
        driver.get("https://hppay.in/");
        List<WebElement> image=driver.findElements(By.xpath("//div[@class='col-md-6 col-12 col-lg-4 mb-5 px-3']"));
        System.out.println(image.size());
    }
}
