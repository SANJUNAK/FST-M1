from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager

# Setup FirefoxDriver using WebDriverManager
firefox_driver_path = GeckoDriverManager().install()

# Create a new instance of FirefoxDriver
driver = webdriver.Firefox(executable_path=firefox_driver_path)

# Navigate to the website
driver.get("http://alchemy.hguy.co/orangehrm")

# Find the header image element by XPath
header_image = driver.find_element_by_xpath("//img[@class='companyLogo']")

# Get the URL of the header image
image_url = header_image.get_attribute("src")

# Print the URL to the console
print("Header Image URL:", image_url)

# Close the browser
driver.quit()
