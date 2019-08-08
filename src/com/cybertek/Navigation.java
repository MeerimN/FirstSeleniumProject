package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver",
                "/Users/meerim/Documents/selenium dependancies /drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        driver.findElement(By.linkText("Gmail")).click();

        if(driver.getTitle().contains("Gmail")){
            System.out.println("Gmail title verification passed!");
        }else{
            System.out.println("Gmail title verification failed!");
        }
        driver.navigate().back();
        Thread.sleep(2000);

        if(driver.getTitle().contains("Google")){
            System.out.println("Google title verification passed!");
        }else{
            System.out.println("Google title verification failed!");
        }
        driver.navigate().forward();
        Thread.sleep(2000);
        if(driver.getTitle().contains("Gmail")){
            System.out.println("Gmail title verification PASSED AGAIN!");
        }else{
            System.out.println("Gmail title verification FAILED AGAIN!");
        }
    }
}
