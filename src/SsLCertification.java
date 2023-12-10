import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SsLCertification {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());



        /*options.setHeadless(true);
        WebDriver driver= new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://www.flipkart.com");
        String title=driver.getTitle();
        System.out.println(title);*/

    }
}
