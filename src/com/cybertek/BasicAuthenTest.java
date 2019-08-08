package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenTest {
    /*
    1. Open a chrome browser
2. Go to website http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
3. Enter username: Tester
4. Enter password: test
5. Click "Sign In" button
6. Verify Title contains:
    Expected: Web Orders (edited)
     */

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver",
                "/Users/meerim/Documents/selenium dependancies /drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        Thread.sleep(1000);
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        Thread.sleep(1000);
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        Thread.sleep(1000);
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();


        if(driver.getTitle().contains("Web Orders")){
            System.out.println("The title verification Passed!");
        }else{
            System.out.println("The title  verification Failed!");

        }
        driver.quit();
    }
}
