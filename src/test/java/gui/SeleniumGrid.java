package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SeleniumGrid {

    public static void main(String[] args) throws MalformedURLException {
//        WebDriver driver = new ChromeDriver();
        String Url = "http://192.168.1.5:4447/wd/hub";
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
        desiredCapabilities.setBrowserName("chrome");
        desiredCapabilities.setPlatform(Platform.MAC);
       WebDriver driver = new RemoteWebDriver(new URL(Url),desiredCapabilities);
        driver.get("https://jqueryui.com/droppable/");        // Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement e=driver.findElement(By.xpath("//*[@id='content']/iframe"));
        driver.switchTo().frame(e);
        WebElement elementFrom = driver.findElement(By.id("draggable"));
        WebElement elementTO = driver.findElement(By.id("droppable"));
        Actions act = new Actions(driver);
        act.dragAndDrop(elementFrom,elementTO).build().perform();
    }

}
