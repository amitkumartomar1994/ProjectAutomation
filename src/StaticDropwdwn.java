import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.support.ui.Select;

public class StaticDropwdwn {
    public static void main(String[] args) {
        FirefoxDriver driver =new FirefoxDriver();
        /*driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement drpdwnobj = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dwpdwn = new Select(drpdwnobj);
        //BY INDEX
       dwpdwn.selectByIndex(3);
        System.out.println(dwpdwn.getFirstSelectedOption().getText());

       //BY VISIBLE TEXT
        dwpdwn.selectByVisibleText("INR");
        System.out.println(dwpdwn.getFirstSelectedOption().getText());

        //BY VALUE
        dwpdwn.selectByValue("AED");
        System.out.println(dwpdwn.getFirstSelectedOption().getText());*/


        driver.get("https://www.axisbank.com/personal-loan/index.html?cta=LoginCTA-target");
        driver.findElement(By.xpath("//a[@class='btn btn-outline-primary axisCust']")).click();
        WebElement sdrp=driver.findElement(By.id("incomeRange"));
        Select select = new Select(sdrp);
        select.selectByValue("Between25kTo30k");


        select.selectByIndex(3);

        select.selectByVisibleText("25k to 30k");
        driver.findElement(By.id("incomeRangeSel")).click();
        driver.close();
        driver.quit();







    }
}
