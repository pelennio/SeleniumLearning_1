package tests_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Example to show how to use XPath in Selenium test.
 * @author JavaCodeGekks.com
 */
public class ExampleSeleniumXPath {

    public static void main(String args[]) throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/len4ik/Documents/ForSelenium/chromedriver");
        WebDriver driver = new ChromeDriver();


        driver.get("http://www.ikea.com/us/en/catalog/categories/departments/dining/21825/");
        driver.findElement(By.xpath("//div[@id='main']/div[@id='topNavigation']/div[@class='departmentLinks']/ul/li[10]/a[@id='lnkTxtChpt5.1LftNavi']/span")).click();
        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("URL title is: " + driver.getCurrentUrl());

        WebElement element=driver.findElement(By.className("headOneGray"));
        System.out.println(element.getText());

        String bodyText = driver.findElement(By.tagName("body")).getText();
        System.out.println(bodyText);

        driver.quit();
    }    }
