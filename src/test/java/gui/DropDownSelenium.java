package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelenium {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/"); /// Launch the URL

        WebElement element = driver.findElement(By.xpath("//select"));
        Select select = new Select(element);
        select.selectByVisibleText("Argentina");


    }

}
