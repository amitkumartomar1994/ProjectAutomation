import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowsHndlhAssignmnt {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/windows']")).click();
        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
        Set<String> window=driver.getWindowHandles();
        Iterator<String>it = window.iterator();
        String parentW= it.next();
        String chlidW = it.next();

        //Windows switch to parent to child
        driver.switchTo().window(chlidW);
        System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());

        //Windows switch child to parent
        driver.switchTo().window(parentW);
        System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
    }
}
