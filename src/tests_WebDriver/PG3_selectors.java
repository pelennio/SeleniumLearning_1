package tests_WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class PG3_selectors {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "/Users/len4ik/Documents/ForSelenium/chromedriver");

        WebDriver driver = new ChromeDriver();
//        driver.get("http://software-testing.ru/");
        driver.get("https://selenium2.ru/component/search/?searchword=Selenium&searchphrase=all&Itemid=105");
        System.out.println(driver.getTitle());

       /* driver.findElement(By.cssSelector("#tpmod-left > div.moduletable_menu > div > ul > li.parent.item45 > a")).click();
        System.out.println(driver.getTitle());

        driver.findElement(By.cssSelector("#tpmod-left > div.moduletable_menu > div > ul > li.parent.item33 > a")).click();
        System.out.println(driver.getTitle());

        driver.findElement(By.cssSelector("#tpmod-left > div:nth-child(5) > div > p:nth-child(1) > a")).click();
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("/*//*[@id='jsn-pos-mainmenu']/div/div/div/ul/li[3]/a/span")).click();
        System.out.println(driver.getTitle());
        String title =driver.getTitle();*/
/*

        String title1="Новости - Selenium - автоматизация веб-приложений";

        try {
            Assert.assertEquals(title1, title);
            System.out.println("It is mathc");

        }catch (Throwable t){
            System.out.println("doesn't matsh");
        }
        driver.navigate().back();
        System.out.println(driver.getTitle());

        driver.findElement(By.cssSelector("#mod-search-searchword")).sendKeys("Selenium");
        driver.findElement(By.cssSelector("#mod-search-searchword")).sendKeys(Keys.ENTER);

        System.out.println("All "+ driver.findElement(By.cssSelector("#searchphraseall-lbl")).isSelected());
        driver.findElement(By.cssSelector("#searchphraseall-lbl")).click();
        System.out.println("All "+ driver.findElement(By.cssSelector("#searchphraseall-lbl")).isSelected());
        System.out.println("Any " + driver.findElement(By.cssSelector("#searchphraseany-lbl")).isSelected());
        System.out.println("Exact "+driver.findElement(By.cssSelector("#searchphraseexact-lbl")).isSelected());

        System.out.println("Categories "+driver.findElement(By.cssSelector("#searchForm > fieldset.only > label:nth-child(2)")).isSelected());
        driver.findElement(By.cssSelector("#searchForm > fieldset.only > label:nth-child(3)")).click();
        System.out.println("Contacts "+driver.findElement(By.cssSelector("#searchForm > fieldset.only > label:nth-child(3)")).isSelected());
        driver.findElement(By.cssSelector("#searchForm > fieldset.only > label:nth-child(4)")).click();
        System.out.println("Articles "+driver.findElement(By.cssSelector("#searchForm > fieldset.only > label:nth-child(4)")).isSelected());

        System.out.println("News Feeds "+driver.findElement(By.cssSelector("#searchForm > fieldset.only > label:nth-child(5)")).isSelected());

        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("/Users/len4ik/Documents/1.png"));
*/

//*[@id="searchForm"]/fieldset[2]/label[1]

        driver.findElement(By.xpath("//*[@id='searchForm']/fieldset[@class='only']/*[@class='checkbox']")).click();
        driver.findElement(By.xpath("//*[@id='searchForm']/fieldset[@class='only']/*[@class='checkbox'][2]")).click();
        driver.findElement(By.xpath("//*[@id='searchForm']/fieldset[@class='only']/*[@class='checkbox'][3]")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id='searchForm']/fieldset[@class='only']/*[@class='checkbox'][4]")).getText());
        System.out.println(driver.findElement(By.cssSelector("#searchForm > fieldset.only > label:nth-child(2)")).getAttribute("for"));


//        71. How to handle hidden elements in Selenium WebDriver?
//        (JavascriptExecutor(driver)).executeScript("document.getElementsByClassName(ElementLocator).click();");
//        driver.close();


//        driver.quit();  // using QUIT all windows will close
    }
}