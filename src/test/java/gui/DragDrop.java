package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();

//        driver.get("https://www.google.com/");
        driver.get("https://jqueryui.com/droppable/"); /// Launch the URL
// Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement e=driver.findElement(By.xpath("//*[@id='content']/iframe"));
        driver.switchTo().frame(e);
        WebElement elementFrom = driver.findElement(By.id("draggable"));
        WebElement elementTO = driver.findElement(By.id("droppable"));
        Actions act = new Actions(driver);
        act.dragAndDrop(elementFrom,elementTO).build().perform();

    }
}
