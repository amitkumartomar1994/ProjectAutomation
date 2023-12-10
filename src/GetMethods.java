import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;

public class GetMethods {
    public static void main(String[] args) {
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/index.php");

        String url =driver.getTitle(); //getting title of website
        System.out.println(url);

        String currenturll=driver.getCurrentUrl(); // getting Url of website
        System.out.println(currenturll);

        String apgesource =driver.getPageSource(); // konsi language se code kiya gya ex-JS,PHP,etc
        System.out.println(apgesource);

        String text=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")).getText();
        System.out.println(text); //getting lable or text koi screen pr text ho
        driver.close();

    }
}
