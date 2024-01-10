package gui;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SCrollByXAxis {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();

//        driver.get("https://www.google.com/");
        driver.get("https://timesofindia.indiatimes.com/sports/cricket/ipl"); /// Launch the URL
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0, 4500)");
        System.out.println("END Of code");
    }

}
