package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
    public static void main(String[] args) throws InterruptedException{


        System.setProperty("webdriver.chrome.driver",
                "/Users/meerim/Documents/selenium dependancies /drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen(); another way of maximize page

        driver.get("https://google.com"); //we creating driver instance


        //Thread.sleep(2000);
        driver.navigate().back(); // step back
        //Thread.sleep(2000);
        driver.navigate().forward();
        //Thread.sleep(2000);
        driver.navigate().refresh();

        System.out.println(driver.getTitle());

        driver.getCurrentUrl();

        System.out.println(driver.getPageSource());

        driver.close();


    }
}
