package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();

//        driver.get("https://www.google.com/");
        driver.get("https://artoftesting.com/samplesiteforselenium"); /// Launch the URL

        WebElement Automation = driver.findElement(By.xpath("//input[@class='Automation']"));
        Automation.click();
        System.out.println(Automation.isSelected());
        WebElement Performance = driver.findElement(By.xpath("//input[@class='Performance']"));
        Performance.click();
        System.out.println(Performance.isSelected());
    }
}
