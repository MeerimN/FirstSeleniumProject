package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPasswordCybertek {
    /**
     *Go to : http://practice.cybertekschool.com/forgot_password
     * Enter email
     * Click “retrieve password” button
     * Make sure “Your e-mail's been sent!” message is displayed.
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/meerim/Documents/selenium dependancies /drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        driver.findElement(By.name("email")).sendKeys("haha@gmail.com");

        driver.findElement(By.id("form_submit")).click();

        WebElement emailSent = driver.findElement(By.xpath("//div[@id='content']"));
        String emailSentText = emailSent.getText();

        if(emailSent.isDisplayed() && emailSentText.equals("Your e-mail's been sent!")){
            System.out.println("The message is displayed!");
        }else{
            System.out.println("The message is not displayed!!!");
        }
    }
}
