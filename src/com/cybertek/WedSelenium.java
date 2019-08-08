package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class WedSelenium {

    public static void main(String[] args) {

        String hamburgerMenuId = "nav-hamburger-menu";
        By categoriesCss = By.cssSelector("ul.hmenu-visible li");

        System.setProperty("webdriver.chrome.driver",
                "/Users/meerim/Documents/selenium dependancies /drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        List<WebElement> categories = new ArrayList<>();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/");

        driver.findElement(By.id(hamburgerMenuId)).click();

        categories = driver.findElements(categoriesCss);

        categories = driver.findElements(categoriesCss);
        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(i).getText().contains("Books & Audible")) {
                categories.get(i).click();
                break;
            }
        }
    }
}
