package com.cybertek;
  /*Retrieve password Task
     1.Open browser
     2. Go to https://the-internet.herokuapp.com/forgot_password
     3. Enter any email
     4. Click on Retrieve password
     5.Verify url contains email_sent
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Password {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/meerim/Documents/selenium dependancies /drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/forgot_password");

        //finding the email input box, sending the keys
        driver.findElement(By.name("email")).sendKeys("haha@gmail.com");
        //finding the button, and clicking on it
        driver.findElement(By.id("form_submit")).click();
        //getting the current url and checking if the expected value is in there
        if(driver.getCurrentUrl().contains("email_sent")){
            System.out.println("URL verification Passed!");
        }else{
            System.out.println("The title   URL verification Failed!");

        }
    }
}
