import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Assertion {
    WebDriver driver;
    @BeforeClass
    void setup()
    {

        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @Test
    void logotest()
    {
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement logo= driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]"));
       Assert.assertTrue(logo.isDisplayed());
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void userbox()
    {
        WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
        Assert.assertTrue(username.isEnabled());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void passwrd()
    {
        WebElement pasword=driver.findElement(By.xpath("//input[@name='password']"));
        Assert.assertTrue(pasword.isEnabled());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void hometitle()
    {
        String title=driver.getTitle();
        Assert.assertEquals("OrangeHRM",title);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterClass
    void teardwon()
    {
       driver.quit();
    }



}
