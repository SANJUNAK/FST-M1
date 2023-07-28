from selenium import webdriver
from webdriver_manager.firefox import GeckoDriverManager

# Setup FirefoxDriver using WebDriverManager
firefox_driver_path = GeckoDriverManager().install()

# Create a new instance of FirefoxDriver
driver = webdriver.Firefox(executable_path=firefox_driver_path)

# Navigate to the website
driver.get("http://alchemy.hguy.co/orangehrm")

# Get the website title
title = driver.title

# Verify if the title matches "OrangeHRM"
if title == "OrangeHRM":
    print("Title verification successful!")
else:
    print("Title verification failed!")

# Close the browser
driver.quit()
