package gui;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://artoftesting.com/samplesiteforselenium"); /// Launch the URL

        Assert.assertEquals(driver.getTitle(),"Sample Webpage for Selenium Automation Practice | ArtOfTesting");
Assert.assertTrue(driver.findElement(By.id("idOfButton")).isEnabled());
Assert.assertNotSame("This is sample text",driver.findElement(By.xpath("//*[@id='idOfDiv']/p/b")).getText());
    }
}
