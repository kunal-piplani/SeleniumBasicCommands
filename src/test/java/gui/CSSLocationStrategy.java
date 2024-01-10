package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocationStrategy {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();

//        driver.get("https://www.google.com/");
        driver.get("https://www.saucedemo.com/"); /// Launch the URL
/*
Location Strat for finding element By type and ID

 */
//        driver.findElement(By.cssSelector("input#user-name")).click();
//        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

//        driver.findElement(By.cssSelector("textarea.gLFyf")).click();
//        driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("XYZ");

        driver.findElement(By.cssSelector("input[id=user-name]")).click();
        driver.findElement(By.cssSelector("input[id=user-name]")).sendKeys("KBC");
//        driver.findElement(By.cssSelector("textarea[class=gLFyf]")).click();
//        driver.findElement(By.cssSelector("textarea[class=gLFyf]")).sendKeys("XYZ");

        driver.findElement(By.cssSelector("input[id*=user-n]")).sendKeys("JAGHA");

    }
}
