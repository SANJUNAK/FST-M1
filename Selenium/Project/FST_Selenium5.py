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

# Click the Edit button
driver.find_element_by_id("btnSave").click()

# Fill in the Name, Gender, Nationality, and DOB fields
driver.find_element_by_id("personal_txtEmpFirstName").clear()
driver.find_element_by_id("personal_txtEmpFirstName").send_keys("John")
driver.find_element_by_id("personal_txtEmpLastName").clear()
driver.find_element_by_id("personal_txtEmpLastName").send_keys("Doe")
# Fill in other fields as needed...

# Click Save
driver.find_element_by_id("btnSave").click()

# Wait for the changes to be saved (you can add explicit waits here if needed)

# Close the browser
driver.quit()
