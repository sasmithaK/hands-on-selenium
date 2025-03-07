package guru99Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Project {
    
    ChromeDriver driver;
    
    // Demo URL for the Guru99 banking project
    String url = "https://demo.guru99.com/V4/";
    
    public void invokeBrowser() {
        // Set path to ChromeDriver (Ensure chromedriver.exe is in the specified path or system PATH)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        
        driver = new ChromeDriver();
        
        // Maximize window and clear cookies
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        // Open Guru99 banking demo site
        driver.get(url);
    }

    public void login(String username, String password) {
        // Locate username field and input provided username
        WebElement usernameElement = driver.findElement(By.name("uid"));
        usernameElement.sendKeys(username);
        
        // Locate password field and input provided password
        driver.findElement(By.name("password")).sendKeys(password);
        
        // Click login button
        driver.findElement(By.name("btnLogin")).click();
    }
    
    public void addCustomer() {
        // Navigate to "New Customer" page
        driver.findElement(By.linkText("New Customer")).click();
        
        // Fill in the new customer form with demo data
        driver.findElement(By.name("name")).sendKeys("John Doe");
        driver.findElement(By.xpath("//input[@value='m']")).click(); // Selecting male gender
        driver.findElement(By.name("dob")).sendKeys("12/03/1990");
        driver.findElement(By.name("addr")).sendKeys("123 Demo Street");
        driver.findElement(By.name("city")).sendKeys("DemoCity");
        driver.findElement(By.name("state")).sendKeys("DemoState");
        driver.findElement(By.name("pinno")).sendKeys("123456");
        driver.findElement(By.name("telephoneno")).sendKeys("0123456789");
        
        // Generate a unique email using timestamp
        String emailId = "Test" + System.currentTimeMillis() + "@demo.com";
        driver.findElement(By.name("emailid")).sendKeys(emailId);
        
        // Enter a demo password (should be securely stored in real scenarios)
        driver.findElement(By.name("password")).sendKeys("SecurePass123!");
        
        // Submit the form
        driver.findElement(By.name("sub")).click();
    }
    
    public String getCustomerId() {
        // Retrieve generated customer ID from the confirmation table
        return driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
    }
    
    public static void main(String[] args) {
        Guru99Project guru = new Guru99Project();
        
        guru.invokeBrowser();
        guru.login("demoUser", "demoPass"); // Use demo credentials
        guru.addCustomer();
        String cusID = guru.getCustomerId();
        System.out.println("Generated Customer ID: " + cusID);
    }
}