package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class FirstSeleniumScript {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/"); /// Launch the URL
        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement((By.id("user-name"))).clear();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        String textOfElement =driver.findElement(By.id("login_credentials")).getText();
        System.out.println(textOfElement);

//        driver.findElement(By.id("login-button")).click();

            Thread.sleep(10000);

         driver.navigate().back();
        Thread.sleep(5000);

        driver.navigate().forward();
        Thread.sleep(5000);

        driver.navigate().refresh();
        Thread.sleep(5000);
        WebElement element1 = driver.findElement(By.id("login_credentials"));
        WebElement element2 = driver.findElement(By.id("password"));
       Actions actions = new Actions(driver);

        actions.dragAndDrop(element1,element2);

driver.quit();


    }
}
