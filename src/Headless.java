import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {
    public static void main(String[] args) {
        //HEADLESS BROWSER USED (Without ui isme ui ki jarurt nhi hoti
        ChromeOptions headblss =new ChromeOptions();
        headblss.setHeadless(true);
        WebDriver driver= new ChromeDriver(headblss);
        driver.get("http://www.google.com");
        String title= driver.getTitle();
        System.out.println(title);
        //
        // isme ek method or hote ise used krne ka selenium wesite se 2 jar files
        // or downloed krni hogi humhe "HTMl unit driver" ki
    }

}
