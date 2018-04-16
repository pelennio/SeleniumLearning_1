package tests_WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PG4_ListLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/len4ik/Documents/ForSelenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.pizzahut.com/index.php#/menu/deals");

        // To store the list
        List<WebElement> eleList = driver.findElements(By.tagName("a"));
// To fetch the size of the list
        int listSize = eleList.size();
        System.out.println(listSize);
//for loop
        for (int i=0; i<listSize; i++)
        {
            WebElement element = eleList.get(i);
            String url=element.getAttribute("href");
            // Clicking on each link
            eleList.get(i).click();
            // Navigating back to the previous page that stores the links
            driver.navigate().back();
        }


//        driver.close();
    }
}