package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertsSelenium {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();

//        driver.get("https://www.google.com/");
        driver.get("https://demo.automationtesting.in/Alerts.html"); /// Launch the URL
        driver.findElement(By.xpath("//*[@id='OKTab']/button")).click();
      Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText());

    }

}
