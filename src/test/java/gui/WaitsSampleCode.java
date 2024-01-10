package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsSampleCode {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.easemytrip.com/"); /// Launch the URL

        driver.findElement(By.id("FromSector_show")).sendKeys("Delhi",
                Keys.ENTER);
        driver.findElement(By.id("Editbox13_show")).sendKeys("Mumbai",
                Keys.ENTER);
        driver.findElement(By.id("ddate")).click();
        driver.findElement(By.id("fst_5_05/01/2024")).click();
        driver.findElement(By.className("src_btn")).click();
        driver.findElement(By.xpath("//button[text()='Book Now']")).click();
    }
}
