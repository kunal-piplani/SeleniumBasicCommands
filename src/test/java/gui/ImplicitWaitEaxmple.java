package gui;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitEaxmple {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40,
                TimeUnit.SECONDS); // pageload timeout
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@id='APjFqb']")).click(); //Finding element and

        driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("om"); //Finding element and
//        driver.findElement(By.xpath("//input[@id='login-signin']")).click(); //Clicking on the next button if element is located




    }
}
