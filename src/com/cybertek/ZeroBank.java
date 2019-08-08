package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {

    /*
    Basic authentication: Zero bank
    1.Open browser
    2. Go to http://zero.webappsecurity.com/login.html
    3. Get the text of “Log in to ZeroBank” find by className
    Expected “Log in to ZeroBank”
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/meerim/Documents/selenium dependancies /drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");
        System.out.println(driver.findElement(By.className("page-header")).getText());

    }
}
