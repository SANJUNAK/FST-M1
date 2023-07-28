import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FST_Selenium6 {
    public static void main(String[] args) {
        // Setup GeckoDriver using WebDriverManager
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

        // Wait for the dashboard to load (you can add explicit waits here if needed)

        // Locate the navigation menu
        WebElement navigationMenu = driver.findElement(By.id("menu_directory_viewDirectory"));

        // Verify that the "Directory" menu item is visible and clickable
        boolean isClickable = navigationMenu.isEnabled();
        if (isClickable) {
            System.out.println("Directory menu item is visible and clickable.");
            // Click on the menu item
            navigationMenu.click();
        } else {
            System.out.println("Directory menu item is not visible or not clickable.");
        }

        // Verify that the heading of the page matches "Search Directory"
        String pageTitle = driver.getTitle();
        if (pageTitle.equals("Search Directory")) {
            System.out.println("Page heading verification successful!");
        } else {
            System.out.println("Page heading verification failed!");
        }

        // Close the browser
        driver.quit();
    }
}
