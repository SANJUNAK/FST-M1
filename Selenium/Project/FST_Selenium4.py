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

# Find the PIM option in the menu and click it
driver.find_element_by_id("menu_pim_viewPimModule").click()

# Click the Add button to add a new Employee
driver.find_element_by_id("btnAdd").click()

# Fill in the required fields (You need to adjust the locators and values based on the actual OrangeHRM site)
driver.find_element_by_id("firstName").send_keys("John")
driver.find_element_by_id("lastName").send_keys("Doe")
driver.find_element_by_id("employeeId").send_keys("EMP12345")
# Fill in other required fields as needed...

# Click Save
driver.find_element_by_id("btnSave").click()

# Wait for the Employee List page to load (you can add explicit waits here if needed)

# Verify the creation of your employee (You need to implement the verification logic here)

# Close the browser
driver.quit()
