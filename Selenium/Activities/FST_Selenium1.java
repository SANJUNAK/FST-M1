import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FST_Selenium1 {
    public static void main(String[] args) {
        // Setup FirefoxDriver using WebDriverManager
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Navigate to the website
        driver.get("http://alchemy.hguy.co/orangehrm");

        // Get the website title
        String title = driver.getTitle();

        // Verify if the title matches "OrangeHRM"
        if (title.equals("OrangeHRM")) {
            System.out.println("Title verification successful!");
        } else {
            System.out.println("Title verification failed!");
        }

        // Close the browser
        driver.quit();
    }
}
