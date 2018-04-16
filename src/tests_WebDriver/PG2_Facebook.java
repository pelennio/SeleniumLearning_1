package tests_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class PG2_Facebook {
    public static void main(String[] args) {
        System.out.println("PG2_facebook");

        Map<String, Object> prefs = new HashMap<String, Object>();
        System.setProperty("webdriver.chrome.driver", "/Users/len4ik/Documents/ForSelenium/chromedriver");
        // Set the notification setting it will override the default setting
        prefs.put("profile.default_content_setting_values.notifications", 2);
        // Create object of ChromeOption class
        ChromeOptions options = new ChromeOptions();
        // Set the experimental option
        options.setExperimentalOption("prefs", prefs);
        // pass the options object in Chrome driver
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);


//        System.setProperty("webdriver.gecko.driver", "/Users/len4ik/Documents/ForSelenium/geckodriver");
//        WebDriver driver = new FirefoxDriver();

// Log In Page
        String baseUrl = "http://www.facebook.com";
        driver.get(baseUrl);

        String PageTitle = driver.getTitle();
        System.out.println(PageTitle);
        String title1 = "Facebook - Log In or Sign Up";
        System.out.println(PageTitle.contentEquals(title1));


        WebElement email = driver.findElement(By.id("email"));
        WebElement pass = driver.findElement(By.id("pass"));
        WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));

        email.sendKeys("pelennio@gmail.com");
        pass.sendKeys("123456Olena");
        login.click();

        //Facebook
        PageTitle = driver.getTitle();
        System.out.println(PageTitle);
        String title2 = "Facebook";
        System.out.println(PageTitle.contentEquals(title2)+"\n");

        driver.findElement(By.xpath("//*[text()='Anna Tsukur - Fit Friends']")).click();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
//        driver.findElement(By.linkText("Discussion")).click();

        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//span[text()='Discussion']")).click();


//        driver.close();
        driver.quit();
//        System.exit(0);
    }
}

