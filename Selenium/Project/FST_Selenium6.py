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

# Locate the navigation menu
navigation_menu = driver.find_element_by_id("menu_directory_viewDirectory")

# Verify that the "Directory" menu item is visible and clickable
is_clickable = navigation_menu.is_enabled()
if is_clickable:
    print("Directory menu item is visible and clickable.")
    # Click on the menu item
    navigation_menu.click()
else:
    print("Directory menu item is not visible or not clickable.")

# Verify that the heading of the page matches "Search Directory"
page_title = driver.title
if page_title == "Search Directory":
    print("Page heading verification successful!")
else:
    print("Page heading verification failed!")

# Close the browser
driver.quit()
