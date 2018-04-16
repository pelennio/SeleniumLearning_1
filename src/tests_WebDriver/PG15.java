package tests_WebDriver;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG15 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "/Users/len4ik/Documents/ForSelenium/geckodriver");

        WebDriver driver=new FirefoxDriver();

        //Launching the site.
        driver.get("http://demo.guru99.com/popup.php");
        driver.manage().window().maximize();

//        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
        driver.findElement(By.xpath(".//a[text()='Click Here']")).click();

        String MainWindow=driver.getWindowHandle();

        // To handle all new opened window.
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();
        System.out.println(i1);

        while(i1.hasNext())
        {
            String ChildWindow=i1.next();

            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                driver.findElement(By.name("emailid"))
                        .sendKeys("gaurav.3n@gmail.com");

                driver.findElement(By.name("btnLogin")).click();

                // Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);
    }
}