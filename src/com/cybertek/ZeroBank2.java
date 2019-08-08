package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Basic authentication Zero bank
 * 1.Open browser
 * 2. Go to http://zero.webappsecurity.com/login.html
 * 3. Get the attribute value of <a href=“”>forgot your password</a>
 * Expected contains “/forgot-password.html”
 */

public class ZeroBank2 {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver",
                "/Users/meerim/Documents/selenium dependancies /drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");
        System.out.println(driver.findElement(By.linkText("Forgot your password ?")).getAttribute("href"));

        if(driver.findElement(By.linkText("Forgot your password ?")).getAttribute("href").contains("/forgot-password.html")){
            System.out.println("Link verification is PASSED!");
            System.out.println("The link does contains expected value!");
        }else{
            System.out.println("Link verification is FAILED!!!");
            System.out.println("The link does NOT contains expected value!!!");
        }
    }
}
