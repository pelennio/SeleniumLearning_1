package tests_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class PG1 {


    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/len4ik/Documents/ForSelenium/geckodriver");
        WebDriver driver = new FirefoxDriver();

        String baseUrl = "https://www.reebok.com/us/reebok-speed-tr/BS8100.html?forceSelSize=BS8100_640";
        driver.get(baseUrl);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//a[@class='ffSelectButton']")).click();
//        driver.findElement(By.xpath("//span[@data-val='BS8100_640']")).click();
        driver.findElement(By.xpath("//button[@name='add-to-cart-button']")).click();
        String cart = "https://www.reebok.com/on/demandware.store/Sites-Reebok-US-Site/en_US/Cart-Show";
        driver.get(cart);


        String coupon = "OUTLET";
        String coupon1 = "OUTLET";
        String coupon2 = "OUTLET";

        driver.findElement(By.xpath("//div[@class='couponcode-header collapsed']")).click();


        for (int i = 1; i <= 10; i++) {

            for (int r = 0; r < 10; r++) {
                coupon = coupon + (char) (r + '0');
                System.out.println(coupon);

                driver.findElement(By.xpath("//form[@id='dwfrm_cart']//input[@id='couponinput']")).sendKeys(coupon);


                coupon = coupon1;
                driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

//                driver.findElement(By.xpath("//form[@id='dwfrm_cart']//input[@type='submit']")).click();

                driver.findElement(By.id("dwfrm_cart_addCoupon")).click();
                String message;
                driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

                message = driver.findElement(By.xpath("//div[@class='ordertotals']//div[@class='summary_value']//p[@class='value']")).getText();
                System.out.println(message);
                driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

                try {
                    driver.findElement(By.xpath("//table[@class='promocoupons ']//tr[@class='couponname']//a[@class='remove']")).isDisplayed();
                    driver.findElement(By.xpath("//table[@class='promocoupons ']//tr[@class='couponname']//a[@class='remove']")).click();
                } catch (NoSuchElementException e) {
                    // throw new RuntimeException("This is where you put the message");
                    System.out.println("No discount======================================");
                    try {
                    driver.findElement(By.xpath("//form[@id='dwfrm_cart']//input[@id='couponinput']")).clear();}
                    catch (ElementNotInteractableException o){
                        System.out.println("some error");
                    }
                }

            } coupon1 = coupon2 + (char) (i + '0');
            coupon=coupon1;
        }
        driver.close();

    }

}