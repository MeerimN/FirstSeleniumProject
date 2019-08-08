package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleEx3 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/meerim/Documents/selenium dependancies /drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://google.com");

        WebElement googleSearch = driver.findElement(By.name("q"));

        String googleSearchText = googleSearch.getText();
        String googleTitle = driver.getTitle();
        System.out.println(googleTitle);
        googleSearch.sendKeys("anything" + Keys.ENTER);
        googleTitle = driver.getTitle();
        System.out.println(googleTitle);

    }
}
