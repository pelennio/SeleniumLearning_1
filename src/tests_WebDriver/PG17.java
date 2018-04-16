package tests_WebDriver;

/**
 * Created by len4ik on 2/21/18.
 */
import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class PG17 {
    public static void main(String[] args) throws ParseException {
        System.setProperty("webdriver.chrome.driver", "/Users/len4ik/Documents/ForSelenium/chromedriver");
        WebDriver wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        wd.get("http://money.rediff.com/gainers/bsc/daily/groupa?");
        WebElement baseTable = wd.findElement(By.tagName("table"));

//        //To find third row of table
//        WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
//        String rowtext = tableRow.getText();
//        System.out.println("Third row of table : "+rowtext);

        //to get 3rd row's 2nd column data
        WebElement cellIneed = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
        String valueIneed = cellIneed.getText();
        System.out.println("Cell value is : " + valueIneed);
        wd.close();
    }


}