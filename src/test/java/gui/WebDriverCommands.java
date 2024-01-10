package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();

//        driver.get("https://www.google.com/");
        driver.get("https://toolsqa.com/selenium-webdriver/selenium-checkbox/"); /// Launch the URL

        WebElement element = driver.findElement(By.xpath("(//a[@title='Selenium Testing'])[2]"));
        System.out.println(element.isDisplayed());


    }


}
