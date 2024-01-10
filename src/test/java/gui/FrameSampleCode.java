package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class FrameSampleCode {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/frames"); /// Launch the URL

        WebElement frame1 = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame1);
        String text = driver.findElement(By.xpath("//*[@id='sampleHeading']")).getText();
        System.out.println("This Is First text frame 1 "+ text);
      driver.switchTo().defaultContent();
        WebElement frame2 = driver.findElement(By.id("frame2"));
        driver.switchTo().frame(frame2);

        String text2 = driver.findElement(By.xpath("//*[@id='sampleHeading']")).getText();
        System.out.println("This Is second text frame 2  "+text2);
    }
}
