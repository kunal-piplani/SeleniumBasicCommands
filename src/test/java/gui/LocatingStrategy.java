package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingStrategy {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/"); /// Launch the URL
//        driver.findElement(By.name("user-name")).click();
//        Thread.sleep(4000);
//        System.out.println(driver.findElement(By.className("login_logo")).getText());
        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement((By.id("user-name"))).clear();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(4000);
        driver.findElement(By.partialLinkText("Link")).click();
        Thread.sleep(4000);
    }

}
