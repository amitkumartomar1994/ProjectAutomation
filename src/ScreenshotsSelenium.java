import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotsSelenium {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //FULL APGE SCREENSHOT
        driver.get("https://hppay.in/");
        /*TakesScreenshot st = (TakesScreenshot)driver;
        File src=st.getScreenshotAs(OutputType.FILE);
        File folder=new File("C:\\ScreenshotsDriver\\homepage.png");
        FileUtils.copyFile(src,folder);*/

        //SCREENSHOT OF SPECIFIC SECTION/PORTION
        /*WebElement hppay=driver.findElement(By.xpath("//body/main[1]/section[3]/div[1]/div[1]/div[1]/div[1]"));
        File src=hppay.getScreenshotAs(OutputType.FILE);
        File folder=new File("C:\\ScreenshotsDriver\\hp.png");
        FileUtils.copyFile(src,folder);*/

        //SCREENSHOTS OF SPECIFIC WEBELEMET
        WebElement logo=driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));
        File src=logo.getScreenshotAs(OutputType.FILE);
        File folder=new File("C:\\ScreenshotsDriver\\logo.png");
        FileUtils.copyFile(src,folder);








    }
}
