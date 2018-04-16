package tests_WebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG14 {


    public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/len4ik/Documents/ForSelenium/chromedriver");
        WebDriver driver = new ChromeDriver();


        // Alert Message handling

        driver.get("http://demo.guru99.com/test/delete_customer.php");


//        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.xpath("//input[@type='text' and @name='cusid']")).sendKeys("53920");
        driver.findElement(By.name("submit")).submit();

        // Switching to Alert
        Alert alert = driver.switchTo().alert();

        // Capturing alert message.
        String alertMessage = driver.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);
        Thread.sleep(5000);
        alert.accept();




        String Title=driver.getTitle();
        System.out.println("Now you are on \""+Title+"\" page");
        driver.close();

    }

}