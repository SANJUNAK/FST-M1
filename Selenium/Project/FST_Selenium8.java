import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FST_Selenium8{
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

        // Find the Qualification option on the left side menu and click it
        driver.findElement(By.id("sidenav")).findElement(By.linkText("Qualifications")).click();

        // Click the Add button to add Work Experience
        driver.findElement(By.id("addWorkExperience")).click();

        // Fill in the required fields for Work Experience (You need to adjust the locators and values based on the actual OrangeHRM site)
        driver.findElement(By.id("experience_employer")).sendKeys("ABC Company");
        driver.findElement(By.id("experience_jobtitle")).sendKeys("Software Engineer");
        // Fill in other fields as needed...

        // Click Save
        driver.findElement(By.id("btnWorkExpSave")).click();

        // Wait for the changes to be saved (you can add explicit waits here if needed)

        // Close the browser
        driver.quit();
    }
}
