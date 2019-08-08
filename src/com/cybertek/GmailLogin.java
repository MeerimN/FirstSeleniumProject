package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "/Users/meerim/Documents/selenium dependancies /drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        Thread.sleep(1000);

        driver.findElement(By.xpath("(//a[@class='gb_d'])[1]")).click();

        Thread.sleep(1000);

        driver.findElement(By.linkText("Sign in")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("email@no.yes");

//        username.sendKeys("haha@gmail.com");

        driver.findElement(By.xpath("")).click();
    }
}
