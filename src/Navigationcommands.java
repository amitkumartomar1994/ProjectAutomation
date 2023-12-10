import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationcommands {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.flipkart.com"); //sbse phle 1st url

        driver.navigate().to("http://www.facebook.com"); // 1st second url pr switch krte hai

        driver.navigate().back(); // fir dobara pichle url pr jaate hai

        driver.navigate().forward(); // fir ek baar or aage waale url pr jaate hai

        driver.navigate().refresh(); // firr ise refresh krte hai jo current url h
    }
}
