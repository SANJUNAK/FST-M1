import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FST_Selenium4{
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

        // Find the PIM option in the menu and click it
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        // Click the Add button to add a new Employee
        driver.findElement(By.id("btnAdd")).click();

        // Fill in the required fields (You need to adjust the locators and values based on the actual OrangeHRM site)
        driver.findElement(By.id("firstName")).sendKeys("John");
        driver.findElement(By.id("lastName")).sendKeys("Doe");
        driver.findElement(By.id("employeeId")).sendKeys("EMP12345");
        // Fill in other required fields as needed...

        // Click Save
        driver.findElement(By.id("btnSave")).click();

        // Wait for the Employee List page to load (you can add explicit waits here if needed)

        // Verify the creation of your employee (You need to implement the verification logic here)

        // Close the browser
        driver.quit();
    }
}
