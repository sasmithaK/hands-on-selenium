package firstSeleniumScript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

public class WorkingWithChrome {
    
    ChromeDriver driver;
    
    public void invokeBrowser() {
        // Set path to ChromeDriver (Ensure chromedriver.exe is in the specified path or system PATH)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        
        driver = new ChromeDriver();
        
        // Maximize the browser's screen
        driver.manage().window().maximize();
        
        // Set custom window size
        Dimension dim = new Dimension(1024, 680);
        driver.manage().window().setSize(dim);
        
        // Bypass all the existing cookies
        driver.manage().deleteAllCookies();
        
        // Open QA Tech Hub website
        driver.get("http://qatechhub.com");
    }

    public void navigateCommands() {
        // Navigate to Facebook
        driver.navigate().to("https://facebook.com");
        
        // Navigate back to the previous page
        driver.navigate().back();
        
        // Navigate forward
        driver.navigate().forward();
        
        // Refresh the page
        driver.navigate().refresh();
    }
    
    public void checkTitle() {
        String title = driver.getTitle();
        
        // Corrected string comparison using .equals() instead of '=='
        if(title.equals("A Automation Tools Trainings and Tutorials | QA Tech Hub")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
    
    public void closeBrowser() {
        // Closes all the windows opened during the session
        driver.quit();
    }
    
    public static void main(String[] args) {
        WorkingWithChrome wc = new WorkingWithChrome();
        
        wc.invokeBrowser();
        wc.checkTitle();
        wc.navigateCommands();
        wc.closeBrowser();
    }
}
