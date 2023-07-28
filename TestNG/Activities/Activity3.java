import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
public class Activity3 {

    public class Activity3 {
        WebDriver driver;

        @BeforeClass
        public void beforeClass() {

            WebDriverManager.firefox().setup();
            driver = new FirefoxDriver();


            driver.get("https://www.training-support.net/selenium/login-form");
        }

        @Test
        public void loginTest() {

            WebElement username = driver.findElement(By.id("username"));
            WebElement password = driver.findElement(By.id("password"));


            username.sendKeys("admin");
            password.sendKeys("password");


            driver.findElement(By.xpath("//button[text()='Log in']")).click();

            //Read login message
            String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
            Assert.assertEquals("Welcome Back, admin", loginMessage);
        }

        @AfterClass
        public void afterClass() {
            //Close browser
            driver.close();
        }
    }
}
