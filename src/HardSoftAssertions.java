import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HardSoftAssertions {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        String expectd= "HPCL HP PAY";
        driver.get("https://hppay.in/");
        String ttl=driver.getTitle();
        System.out.println(ttl);
        Assert.assertEquals(expectd,ttl);

    }
}
