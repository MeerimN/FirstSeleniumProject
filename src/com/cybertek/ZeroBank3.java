package com.cybertek;

import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank3 {
    /**
     * Basic authentication Zero bank
     * 1.Open browser
     * 2. Go to http://zero.webappsecurity.com/login.html
     * 3.Enter username: username
     * 4.Enter password: password
     * 5.Click sign in button
     * 6.Verify username is displayed on page
     * 7.Verify the title Zero - Account Summary
     * 8.Verify the link Account Summary's href value contains: "account-summary"
     *     Print out results in validation format
     */


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/meerim/Documents/selenium dependancies /drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        //locate inputUsername
        WebElement inputUsername = driver.findElement(By.id("user_login"));
        //locate inputPassword
        WebElement inputPassword = driver.findElement(By.id("user_password"));
        //locate signIn button
        WebElement signInButton = driver.findElement(By.name("submit"));

        String expectedUsername = "username";

        inputUsername.sendKeys(expectedUsername);

        inputPassword.sendKeys("password");

        signInButton.click();

        //locating profileUsername
        WebElement actualProfileUsername = driver.findElement(By.linkText("username"));
        String actualUsernameText = actualProfileUsername.getText();

        if(actualProfileUsername.isDisplayed()){
            System.out.println("Username is displayed!");
        }else{
            System.out.println("Username is not displayed!!!");
        }

        if(actualUsernameText.contains(expectedUsername)){
            System.out.println("Username verification PASSED!");
        }else{
            System.out.println("Username verification FAILED!!!");
        }
        //Verify username is displayed on page
        //Verify the title Zero - Account Summary
        String expectedTitle = "Zero - Account Summary";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }
        String expectedInHref = "account-summary";
        //locate accountSummaryLink
        WebElement accountSummaryLink = driver.findElement(By.linkText("Account Summary"));
        String actualHrefValue = accountSummaryLink.getAttribute("href");

        if(actualHrefValue.contains(expectedInHref)){
            System.out.println("Expected HREF is inside of the Actual HREF!");
            System.out.println("HREF VERIFICATION PASSED!");
        }else{
            System.out.println("Expected HREF is not inside of the Actual HREF!!!");
            System.out.println("HREF VERIFICATION FAILED!!!");
        }
    }
}
