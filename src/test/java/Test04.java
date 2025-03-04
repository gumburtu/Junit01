import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test04 {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //@Ignore("Kullanilmamasi gerekiyor.")
    @Test
    public void titleTestForGoogle() {
        driver.get("https://www.google.com/");
        String expectedData = "Google";
        String actualData = driver.getTitle();
        Assert.assertTrue(actualData.equals(expectedData));

    }

    @Test
    public void titleTestForAmazon() {
        driver.get("https://www.amazon.co.uk/");
        String expectedData = "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more";
        String actualData = driver.getTitle();
        Assert.assertTrue(actualData.equals(expectedData));

    }

    @AfterClass
    public static void teardown() {
        driver.quit();
    }
}