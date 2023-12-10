import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

public class automation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().getImplicitWaitTimeout();
        driver.manage().timeouts().getPageLoadTimeout();
        driver.manage().timeouts().getScriptTimeout();
        /*driver.get("https://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();
        driver.findElement(By.name("userName")).sendKeys("Mercury");
        driver.findElement(By.name("password")).sendKeys("Mercury");
        driver.findElement(By.name("submit")).click();
        /*String expectedtitle=" Mercury Tours";
        String actualtitle= driver.getTitle();
        if(expectedtitle==actualtitle)
            System.out.println("test is pass");
        else
            System.out.println("test is failed");
        String titile=driver.getTitle();
        System.out.println(titile);*/

        /*driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        String expected="Sign up for Facebook";
        String title= driver.getTitle();
        if(expected==title)
            System.out.println("test is pass");
        else
            System.out.println("test is failed");*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter fisrt number");
        int a = sc.nextInt();

        System.out.println(" enter second number");
        int b = sc.nextInt();

        System.out.println(a/b);*/









    }
}
