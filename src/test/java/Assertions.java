import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Assertions {
    static WebDriver driver;

    @BeforeClass
    public static void setUpTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void LoginTest() {
        driver.get("https://www.google.com");
        String actualData = driver.getTitle();
        String expectedData = "Google";
        if (expectedData.equals(expectedData)) {
            System.out.println("Baslik Dogru");
        } else {
            System.out.println("Baslik Yanlis");
        }
    }

    @AfterClass
    public static void kapatma() {
        driver.quit();
    }
}
