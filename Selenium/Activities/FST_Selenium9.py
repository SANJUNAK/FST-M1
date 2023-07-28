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

# Navigate to the "My Info" page
driver.find_element_by_id("menu_pim_viewMyDetails").click()

# Locate the left hand menu
left_hand_menu = driver.find_element_by_id("sidenav")

# Click on the "Emergency Contacts" menu item
left_hand_menu.find_element_by_link_text("Emergency Contacts").click()

# Retrieve information about all the contacts listed in the table
contacts_rows = driver.find_elements_by_xpath("//table[@id='emgcontact_list']/tbody/tr")
for row in contacts_rows:
    cells = row.find_elements_by_tag_name("td")
    name = cells[1].text
    relationship = cells[2].text
    mobile = cells[3].text
    work_phone = cells[4].text
    print("Name: " + name + ", Relationship: " + relationship + ", Mobile: " + mobile + ", Work Phone: " + work_phone)

# Close the browser
driver.quit()
