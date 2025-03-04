import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test03 {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void mySearchTest() {
        driver.get("https://shop.demoqa.com/");
        driver.findElement(By.xpath("//a[class=\"noo-search\"]")).click();
        WebElement searchBox = driver.findElement(By.name("s"));
        searchBox.sendKeys("DRESS");
        searchBox.sendKeys(Keys.ENTER);

        String expectedData = "Showing all 16 results";
        WebElement actualDataWE = driver.findElement(By.className("woocommerce-result-count"));
        String actualData = actualDataWE.getText();
        //Assert.assertTrue(actualDataWE.isDisplayed());
        //Assert.assertTrue(actualData.equals(expectedData));
        //Assert.assertEquals(expectedData, actualData);
        //Assert.assertTrue(actualData.contains("16"));
        Assert.assertFalse(actualData.contains("16"));
    }
    @AfterClass
    public static  void teardown(){
        driver.quit();
    }
}
