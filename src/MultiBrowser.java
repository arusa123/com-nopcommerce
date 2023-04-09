import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {

    static String browser = "Edge";
    static WebDriver driver;
    static String baseURL = "https://demo.nopcommerce.com/login?returnUrl=%2";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chorme")){
             driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")){
             driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        } else {
            System.out.println("Invalid browser");
        }
        //open URL
        driver.get(baseURL);
        // open the title page
        String title = driver.getTitle();
        System.out.println(title);
        //Print the Current URL
        System.out.println("Current URL" + driver.getCurrentUrl());
        //Print the page Source
        System.out.println("Page source" + driver.getPageSource());
        //Enter the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Prime@gmail.com");
        // enter the password to password field
        driver.findElement(By.name("Password")).sendKeys("Prime123");
        //close the browser
        driver.close();
    }

}
