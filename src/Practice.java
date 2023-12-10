import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        /*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        //RADIO BUTTON
        driver.findElement(By.xpath("//input[@name='radioButton'][1]")).click();

        //AUTOSUGGEST DRPDWN
        WebElement from=driver.findElement(By.id("autocomplete"));
        from.sendKeys("India");
        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys(Keys.ENTER);
        driver.findElement(By.id("dropdown-class-example")).sendKeys("option 3");
        driver.findElement(By.id("checkBoxOption2")).click();
        driver.findElement(By.id("openwindow")).click();
        Set<String> window=driver.getWindowHandles();
        Iterator<String>it= window.iterator();
        String parent= it.next();
        String child = it.next();
        driver.switchTo().window(child);
        System.out.println(driver.getTitle());
        driver.switchTo().window(parent);
        driver.findElement(By.id("name")).sendKeys("Amit Kumar");
        driver.findElement(By.id("alertbtn")).click();
        driver.switchTo().alert().accept();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("confirmbtn")).click();
        driver.switchTo().alert().dismiss();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);*/

        driver.get("https://www.makemytrip.com/flights/");
        driver.findElement(By.className("lbl_input appendBottom10")).click();
        WebElement from=driver.findElement(By.xpath("//input[@autocomplete='off']"));
        from.sendKeys("Bom");
        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/label/span")).click();
        WebElement to=driver.findElement(By.id("toCity"));
        to.sendKeys("yyz");
        to.sendKeys(Keys.ARROW_DOWN);
        to.sendKeys(Keys.ENTER);
        }




    }

