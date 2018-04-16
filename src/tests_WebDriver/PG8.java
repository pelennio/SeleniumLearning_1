//найти ивсе ссылки на странице

package tests_WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PG8 {

    public static void main(String[] args) {
        String baseUrl = "http://demo.guru99.com/selenium/newtours/";
        System.setProperty("webdriver.chrome.driver", "/Users/len4ik/Documents/ForSelenium/chromedriver");
        WebDriver driver = new ChromeDriver();
//
//        Exception in thread "main" org.openqa.selenium.WebDriverException: unknown error: Element <a href="#/sign-in/" data-analytics-action="..." data-ng-show="account.isGuest" class="btn btn-primary pull-left ph-theme-active-link ph-padding-right-0 no-border" data-ng-class="{'no-border' : variant === 'a'}" data-snap-close="" data-ui-sref="index.signin()" style="">Sign In</a> is not clickable at point (30, 27). Other element would receive the click: <a id="lg-nav-menu" href="" class="btn btn-link dropdown-toggle ph-titlecase menuLables no-border" dropdown-toggle="" data-ng-class="{'no-border' : variant === 'a'}" aria-haspopup="true" aria-expanded="false">...</a>
//                (Session info: chrome=64.0.3282.167)

        String underConsTitle = "Under Construction: Mercury Tours";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        driver.get(baseUrl);
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        String[] linkTexts = new String[linkElements.size()];
        int					i = 0;

        //extract the link texts of each link element
        for (WebElement e : linkElements) {
            linkTexts[i] = e.getText();
            i++;
        }

        //test each link
        for (String t : linkTexts) {
            driver.findElement(By.linkText(t)).click();
            if (driver.getTitle().equals(underConsTitle)) {
                System.out.println("\"" + t + "\""
                        + " is under construction.");
            } else {
                System.out.println("\"" + t + "\""
                        + " is working.");
            }
            driver.navigate().back();
        }
        driver.quit();
    }

}			