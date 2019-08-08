package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicexpath {
    /**
     * Go to : http://practice.cybertekschool.com/forgot_password
     * Locate every single webelement on this page using xpath.
     * Make sure they are all displayed.
     * Make sure the texts are as expected as well.
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/meerim/Documents/selenium dependancies /drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        //locate the homeLink
        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        String homeLinkText = homeLink.getText();

        if(homeLink.isDisplayed() && homeLinkText.equals("Home")){
            System.out.println("Home link verification passed!");
        }else{
            System.out.println("Home link verification failed!!!");
            System.out.println("Either text is not matching or link is not displayed!");
        }

        //locate forgot password header
        WebElement forgotPasswordHeader = driver.findElement(By.xpath("//div[@class='example']/h2"));
        String forgotPasswordHeaderText = forgotPasswordHeader.getText();

        if(forgotPasswordHeader.isDisplayed() && forgotPasswordHeaderText.equals("Forgot Password")){
            System.out.println("Forgot password verification Passed!");
        }else{
            System.out.println("Forgot password verification Failed!!!");
        }

        //locate email label
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));
        String emailLabelText = emailLabel.getText();

        if(emailLabel.isDisplayed() && emailLabelText.equals("E-mail")){
            System.out.println("Email label verification Passed!");
        }else{
            System.out.println("Email label verification Failed");
        }

        //locate input emailbox
        WebElement emailBox =  driver.findElement(By.xpath("//input[@type='text']"));

        if(emailBox.isDisplayed()){
            System.out.println("Input email box verification Passed!");
        }else{
            System.out.println("Input email box verification Failed!!");
        }

        // locate retrieve password button
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));
        String retrievePasswordButtonText = retrievePasswordButton.getText();

        if(retrievePasswordButton.isDisplayed() && retrievePasswordButtonText.equals("Retrieve password")){
            System.out.println("Button verification Passed!");
        }else{
            System.out.println("Button verification Failed!!!");
        }

        //locate powered by Cybertek footnote
        WebElement cybertekFootnote = driver.findElement(By.xpath("//div[contains(@style, 'text-align')]"));
        String cebertekFootnoteText = cybertekFootnote.getText();

        if(cybertekFootnote.isDisplayed() && cebertekFootnoteText.equals("Powered by Cybertek School")){
            System.out.println("Footnote verification Passed!");
        }else{
            System.out.println("Footnote verification Failed!!!");
        }
    }
}
