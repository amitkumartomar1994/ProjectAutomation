import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BootstrapDrpdwn {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hdfcbank.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[13]/div[1]/div/div/div[2]/div[1]/div[3]/div/div/div/div/div/div[2]/div/a")).click();
        List<WebElement> product=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
        System.out.println(product.size());
        for (WebElement types:product)
        {
            if (types.getText().equals("Life Insurance"))
            {
                types.click();
                break;
            }

        }
        driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
        List<WebElement> a= driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
        System.out.println(a.size());
        for (WebElement type2:a)
        {
            if (type2.getText().equals("Business Loan"))
            {
                type2.click();
                break;
            }


        }


    }  }