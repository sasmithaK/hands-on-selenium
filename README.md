# Hands-on Selenium Automation

## Overview
This project contains Selenium WebDriver scripts for automating various web interactions using Google Chrome. It demonstrates browser invocation, navigation commands, form filling, and validation tests on different websites.

## Prerequisites
Before running the scripts, ensure you have the following installed:
- Java Development Kit (JDK) 8 or later
- Selenium WebDriver
- ChromeDriver (compatible with your Chrome browser version)
- An IDE (Eclipse, IntelliJ IDEA, or VS Code)

## Project Structure
- `WorkingWithChrome.java`: Automates browser interactions such as navigation and validation.
- `Guru99Project.java`: Automates login and customer registration on the Guru99 demo site (https://demo.guru99.com/V4/).
- `newFacebook.java`: Automates Facebook account creation (for demonstration purposes).

## Setup Instructions
1. **Download and Install Dependencies:**
   - Download Selenium WebDriver from [SeleniumHQ](https://www.selenium.dev/downloads/).
   - Download ChromeDriver from [ChromeDriver Site](https://chromedriver.chromium.org/downloads/) and place it in your system PATH.

2. **Clone the Repository:**
   ```sh
   git clone https://github.com/sasmithaK/hands-on-selenium.git
   cd hands-on-selenium
   ```

3. **Update ChromeDriver Path:**
   - Open Java files and replace `path/to/chromedriver.exe` with the actual path where `chromedriver.exe` is located.

## Run the script
   - To execute the automation scripts, run the `main` method in the respective Java files using your preferred IDE or command line.

## Notes
- Ensure that ChromeDriver and Google Chrome are compatible versions.
- Avoid hardcoding sensitive credentials; use environment variables or secure vaults instead.

