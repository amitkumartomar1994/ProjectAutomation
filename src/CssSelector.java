import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        //TAG AND ID [# value of id}
        //driver.findElement(By.cssSelector("input#email")).sendKeys("8742980803");

        //TAG AND CLASS [. value of class]
       // driver.findElement(By.cssSelector(".inputtext")).sendKeys("amit@gmail.com");

        // TAG [Attribute=value]
        //driver.findElement(By.cssSelector("input[name=email")).sendKeys("milli");

        // TAG class & attributes
        driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("vandana");





    }
}
