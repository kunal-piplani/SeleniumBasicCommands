package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();

//        driver.get("https://www.google.com/");
        driver.get("https://jqueryui.com/droppable/"); /// Launch the URL
        WebElement frame = driver.findElement(By.xpath("//*[@id='content']/iframe"));
        driver.switchTo().frame(frame);

        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(from,to).build().perform();

    }
}
