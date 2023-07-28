import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;

public class FST_Selenium9 {
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

        // Navigate to the "My Info" page
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();

        // Locate the left hand menu
        WebElement leftHandMenu = driver.findElement(By.id("sidenav"));

        // Click on the "Emergency Contacts" menu item
        leftHandMenu.findElement(By.linkText("Emergency Contacts")).click();

        // Retrieve information about all the contacts listed in the table
        List<WebElement> contactsRows = driver.findElements(By.xpath("//table[@id='emgcontact_list']/tbody/tr"));
        for (WebElement row : contactsRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            String name = cells.get(1).getText();
            String relationship = cells.get(2).getText();
            String mobile = cells.get(3).getText();
            String workPhone = cells.get(4).getText();
            System.out.println("Name: " + name + ", Relationship: " + relationship + ", Mobile: " + mobile + ", Work Phone: " + workPhone);
        }

        // Close the browser
        driver.quit();
    }
}
