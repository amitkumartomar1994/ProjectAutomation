import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Actions a = new Actions(driver);

        //Move to specific Elements
       /* WebElement move=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        a.moveToElement(move).build().perform();

        //Write in Capital letter in text box
        a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello")
                .build().perform();

        //Select entire string in search  box whatever hav eu writeen there
        a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello")
                .doubleClick().build().perform();*/

        //How to right click in automation selenium
        WebElement move=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        a.moveToElement(move).contextClick().build().perform();
    }
    }


