import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpdateDrpdwn {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();

        //WHILE LOOP
        int i=1;
        while (i<5) {
            driver.findElement(By.id("hrefIncAdt")).click();
            i = i + 1;

        }

        //FOR LOOP
         for(int a=0; a<3; a=a+1 )
        driver.findElement(By.id("hrefIncChd")).click();


        driver.findElement(By.id("btnclosepaxoption")).click();



    }
}
