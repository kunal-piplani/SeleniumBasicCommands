package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingIsEnabled {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();

//        driver.get("https://www.google.com/");
        driver.get("https://artoftesting.com/samplesiteforselenium"); /// Launch the URL
        System.out.println(driver.findElement(By.id("idOfButton")).isEnabled());
    }
}
