package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/meerim/Documents/selenium dependancies /drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://etsy.com");
        //driver.findElement(By.id("search-query")).sendKeys("wooden spoon" + Keys.ENTER);
        driver.findElement(By.partialLinkText("Register")).click();

        if(driver.getTitle().contains("Wooden spoon")){
            System.out.println("The title verification Passed!");
        }else{
            System.out.println("The title  verification Failed!");

        }


    }

}
