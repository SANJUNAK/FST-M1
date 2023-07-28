import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FST_Selenium2 {
    public static void main(String[] args) {
        // Setup FirefoxDriver using WebDriverManager
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Navigate to the website
        driver.get("http://alchemy.hguy.co/orangehrm");

        // Find the header image element by XPath
        WebElement headerImage = driver.findElement(By.xpath("//img[@class='companyLogo']"));

        // Get the URL of the header image
        String imageUrl = headerImage.getAttribute("src");

        // Print the URL to the console
        System.out.println("Header Image URL: " + imageUrl);

        // Close the browser
        driver.quit();
    }
}
