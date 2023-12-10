import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traversparenttochild {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //PARENT TO CHILD
        System.out.println(driver.findElement(By.xpath("//div/button[1]")).getText());

        //CHILD TO SIBLING
        System.out.println(driver.findElement(By.xpath("//div/button[1]/following-sibling::button[1]")));
    }
}
