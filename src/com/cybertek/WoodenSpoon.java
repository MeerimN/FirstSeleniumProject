package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 1-Go to amazon.com
 * 2-Type “wooden spoon” inside of search box
 * 3-Click to search button
 * 4-Verify title has wooden spoon
 * 5- Also verify results under search box also has “wooden spoon” as well
 */

public class WoodenSpoon {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/meerim/Documents/selenium dependancies /drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //go to the amazon.com
        driver.get("https://amazon.com");

        //enter a "wooden spoon" to search
        //locate the search box
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("wooden spoon" + Keys.ENTER);

        String expectedTitle = "wooden spoon";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }
        WebElement searchRes =  driver.findElement(By.xpath("//span[@class = 'a-color-state a-text-bold']"));
        String searchLinkText = searchRes.getText();
        if(searchRes.isDisplayed() & searchLinkText.contains("wooden spoon")){
            System.out.println("Search link verification Passed!");
        } else{
            System.out.println("Search link verification Failed!");
        }
    }
}
