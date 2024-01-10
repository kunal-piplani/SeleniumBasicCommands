package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationStrategyXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/"); /// Launch the URL

/*
absolute XPATH -- single slash
 */
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).click();
       /*
absolute XPATH
 */
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("absolute");

/*
Relative  XPATH : double Slash
 */
        driver.findElement(By.xpath("//form/div[1]/input[1]")).sendKeys("rleative");


/*
Single Attribute
 */
        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("single ");



/*
Multiple  Attribute
 */
        driver.findElement(By.xpath("//*[@id='user-name'][@placeholder='Username']")).sendKeys("Multiple");




    /*
AND   Attribute
 */
        driver.findElement(By.xpath("//*[@id='user-name' and @placeholder='Username']")).sendKeys("AND");


            /*
OR   Attribute
 */
        driver.findElement(By.xpath("//*[@id='user-name' or @placeholder='Username']")).sendKeys("OR");

/*

contains

 */

        driver.findElement(By.xpath("//*[contains(@id,'user-na')]")).sendKeys("Contains");


/*

startWith

 */

        driver.findElement(By.xpath("//*[starts-with(@id,'use')]")).sendKeys("startWith");
/*

Using Text

 */


        driver.findElement(By.xpath("//*[text()='LinkedIn']")).click();




    }



}