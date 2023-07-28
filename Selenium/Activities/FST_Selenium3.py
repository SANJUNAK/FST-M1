from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager

# Setup FirefoxDriver using WebDriverManager
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

# Wait for the homepage to load (you can add explicit waits here if needed)

# Verify that the homepage has opened
page_title = driver.title
if page_title == "OrangeHRM":
    print("Login successful! Homepage opened.")
else:
    print("Login failed! Homepage not opened.")

# Close the browser
driver.quit()
