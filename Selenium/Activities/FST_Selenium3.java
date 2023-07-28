import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FST_Selenium3 {
    public static void main(String[] args) {
        // Setup FirefoxDriver using WebDriverManager
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Navigate to the login page
        driver.get("http://alchemy.hguy.co/orangehrm");

        // Find and select the username and password fields
        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        WebElement passwordField = driver.findElement(By.id("txtPassword"));

        // Enter login credentials into the respective fields
        usernameField.sendKeys("orange");
        passwordField.sendKeys("orangepassword123");

        // Click login
        driver.findElement(By.id("btnLogin")).click();

        // Wait for the homepage to load (you can add explicit waits here if needed)

        // Verify that the homepage has opened
        String pageTitle = driver.getTitle();
        if (pageTitle.equals("OrangeHRM")) {
            System.out.println("Login successful! Homepage opened.");
        } else {
            System.out.println("Login failed! Homepage not opened.");
        }

        // Close the browser
        driver.quit();
    }
}
