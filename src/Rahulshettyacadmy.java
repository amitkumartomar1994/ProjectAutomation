
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rahulshettyacadmy {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        //driver.findElement(By.cssSelector("input[placeholder=Name")).sendKeys("abc");
        driver.findElement(By.xpath("//form/input[1]")).sendKeys("Amit Kumar");
        driver.findElement(By.xpath("//form/input[2]")).sendKeys("Amit@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("8742980803");
        driver.findElement(By.xpath("//div/button[2]")).click();
        driver.findElement(By.xpath("//div/button[1]")).click();
        driver.findElement(By.id("inputUsername")).sendKeys("Amit Kumar");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
        //driver.findElement(By.cssSelector("button[class=logout-btn]")).click();
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
        driver.close();










    }
}
