package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchVerification {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver",
                "/Users/meerim/Documents/selenium dependancies /drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        //driver.findElement(By.name("q")).sendKeys("apple");
        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);

        //Thread.sleep(1000);
        //driver.findElement(By.name("btnK")).click();
        if(driver.getTitle().startsWith("apple")){
            System.out.println("The title starts with apple");
        }else{
            System.out.println("The title does not starts with apple");
        }

    }
}
