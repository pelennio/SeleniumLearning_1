package tests_WebDriver;

/**
 * Created by len4ik on 2/25/18.
 */

import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class brokenImages {
    static int invalidimg;
    static WebDriver driver;

    public static void main(String[] args) {
        try {
            System.setProperty("webdriver.gecko.driver", "/Users/len4ik/Documents/ForSelenium/geckodriver");
            driver = new FirefoxDriver();
            driver.get("https://www.petfinder.com/cat-breeds/");
            invalidimg = 0;
            List allImages = driver.findElements(By.tagName("img"));
            System.out.println("Total  images are " + allImages.size());
            for (int i = 0; i < allImages.size(); i++) {
                WebElement img = (WebElement) allImages.get(i);
                if (img != null) {
                    verifyimgActive(img);
                }
            }

            System.out.println("Total invalid images are " + invalidimg);
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }


    public static void verifyimgActive(WebElement img) {
        try {
            HttpResponse response = new DefaultHttpClient().execute(new HttpGet(img.getAttribute("src")));
            if (response.getStatusLine().getStatusCode() != 200)
                invalidimg++;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

