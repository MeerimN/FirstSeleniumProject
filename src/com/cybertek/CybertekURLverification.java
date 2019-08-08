package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekURLverification {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/meerim/Documents/selenium dependancies /drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://cybertekschool.com/");

        if(driver.getCurrentUrl().contains("Cybertekschool")) {
            System.out.println("Cybertek URL verification passed");
        }else{
            System.out.println("Cybertek URL verification failed");

            //driver.findElement(By.name("q")).sendKeys("apple");
        }
    }
}
