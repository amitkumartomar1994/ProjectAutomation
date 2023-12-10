import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LinksImagesPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        //LINKS OF ENTIRE PAGE
        System.out.println(driver.findElements(By.tagName("a")).size());

        //LINKS OF FOOTER PAGE
        WebElement footer=driver.findElement(By.xpath("//div[@class='navLeftFooter nav-sprite-v1']"));
        System.out.println(footer.findElements(By.tagName("a")).size());

        //LINKS OF TOP PAGE
        WebElement top=driver.findElement(By.id("nav-main"));
        System.out.println(top.findElements(By.tagName("a")).size());




    }

}
