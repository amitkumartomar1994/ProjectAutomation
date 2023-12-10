import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ScrollWindow {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,500)");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
        List<WebElement> values = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
        int sum = 0;
        for (int i = 0; i < values.size(); i = i + 1) {

            sum = sum + Integer.parseInt(values.get(i).getText());

        }
        System.out.println(sum);
        //String c = String.valueOf(driver.findElement(By.xpath("//div[@class='totalAmount']")));
        System.out.println(sum/2);



    }}

