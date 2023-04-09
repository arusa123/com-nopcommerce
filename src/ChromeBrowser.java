import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        //open URL
        driver.get(baseUrl);
        //Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //Print the current URL
        System.out.println("Current URL:" + driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page source:" + driver.getPageSource());
        //Enter the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("prime@gmail.com");
        //Enter the password to password field
        driver.findElement(By.name("Password")).sendKeys("Prime123");
        //close the browser
        driver.close();

    }
}
