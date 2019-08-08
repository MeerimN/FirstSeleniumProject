package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/meerim/Documents/selenium dependencies /drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("apple");
        driver.findElement(By.name("btnK")).click();
    }
}
