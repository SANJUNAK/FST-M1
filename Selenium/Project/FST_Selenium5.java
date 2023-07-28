import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FST_Selenium5 {
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

        // Find the "My Info" menu item and click it
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();

        // Click the Edit button
        driver.findElement(By.id("btnSave")).click();

        // Fill in the Name, Gender, Nationality, and DOB fields
        driver.findElement(By.id("personal_txtEmpFirstName")).clear();
        driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("John");
        driver.findElement(By.id("personal_txtEmpLastName")).clear();
        driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Doe");
        // Fill in other fields as needed...

        // Click Save
        driver.findElement(By.id("btnSave")).click();

        // Wait for the changes to be saved (you can add explicit waits here if needed)

        // Close the browser
        driver.quit();
    }
}
