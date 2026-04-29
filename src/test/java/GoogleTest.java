import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;

public class GoogleTest {
    @Test
    public void openWebsite() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.entrepreneur.com/");
        System.out.println("Title:"+driver.getTitle());
        Thread.sleep(5000);
        driver.quit();
    }
}
