package newFB;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class newFacebook {

    ChromeDriver driver;
    
    // Demo URL for Facebook
    String url = "http://www.fb.com";
    
    public void invokeBrowser() {
        // Set path to ChromeDriver (Ensure chromedriver.exe is in the specified path or system PATH)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        
        driver = new ChromeDriver();
        
        // Maximize window and clear cookies
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        // Open Facebook
        driver.get(url);
    }

    public void checkURL() {
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL : " + currentURL);
    }

    public void createNewAccount() {
        // Click on "Create New Account" button
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
        
        // Fill in the sign-up form with demo data
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Doe");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("john.doe@example.com");
        
        // Clear and re-enter email for confirmation
        driver.findElement(By.xpath("//input[@name='reg_email__']")).clear();
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("john.doe@example.com");
        
        // Enter password (use environment variables for real projects)
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("SecurePass123!");
        
        // Select birth date (Example: 10th May 1995)
        driver.findElement(By.xpath("//span[@class='_5k_4']/span/select/option[10]")).click();
        driver.findElement(By.xpath("//span[@class='_5k_4']/span/select[2]/option[5]")).click();
        driver.findElement(By.xpath("//span[@class='_5k_4']/span/select[3]/option[30]")).click();
        
        // Select gender (Example: Male)
        driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/label")).click();
        
        // Click sign-up button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public static void main(String[] args) {
        newFacebook fb = new newFacebook();
        
        fb.invokeBrowser();
        fb.checkURL();
        fb.createNewAccount();
    }
}
