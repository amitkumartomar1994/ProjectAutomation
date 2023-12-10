import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDrpdwn {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://hppay.in/");
//        driver.findElement(By.xpath("//a[@href='https://hppay.in/apply-now']")).click();
//        driver.findElement(By.id("enrsubmit")).click();
//        driver.findElement(By.xpath("//select[@id='state']")).sendKeys("DELHI");
//        driver.findElement(By.xpath("//select[@id='city']")).click();
//        driver.findElement(By.xpath("//option[@value='242']")).click();
        driver.get("https://www.makemytrip.com/flights/");
        driver.findElement(By.id("fromCity")).click();
        driver.findElement(By.className("font14 appendBottom5 blackText")).click();





    }
}
