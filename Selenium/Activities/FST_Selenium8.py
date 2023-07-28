from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager

# Setup GeckoDriver using WebDriverManager
firefox_driver_path = GeckoDriverManager().install()

# Create a new instance of FirefoxDriver
driver = webdriver.Firefox(executable_path=firefox_driver_path)

# Navigate to the login page
driver.get("http://alchemy.hguy.co/orangehrm")

# Find and select the username and password fields
username_field = driver.find_element_by_id("txtUsername")
password_field = driver.find_element_by_id("txtPassword")

# Enter login credentials into the respective fields
username_field.send_keys("orange")
password_field.send_keys("orangepassword123")

# Click login
driver.find_element_by_id("btnLogin").click()

# Wait for the dashboard to load (you can add explicit waits here if needed)

# Find the "My Info" menu item and click it
driver.find_element_by_id("menu_pim_viewMyDetails").click()

# Find the Qualification option on the left side menu and click it
driver.find_element_by_id("sidenav").find_element_by_link_text("Qualifications").click()

# Click the Add button to add Work Experience
driver.find_element_by_id("addWorkExperience").click()

# Fill in the required fields for Work Experience (You need to adjust the locators and values based on the actual OrangeHRM site)
driver.find_element_by_id("experience_employer").send_keys("ABC Company")
driver.find_element_by_id("experience_jobtitle").send_keys("Software Engineer")
# Fill in other fields as needed...

# Click Save
driver.find_element_by_id("btnWorkExpSave").click()

# Wait for the changes to be saved (you can add explicit waits here if needed)

# Close the browser
driver.quit()
