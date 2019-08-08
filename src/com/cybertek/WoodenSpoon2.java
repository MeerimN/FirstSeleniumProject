package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WoodenSpoon2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/meerim/Documents/selenium dependancies /drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //implicit wait of pausing
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //go to the amazon.com
        driver.get("https://amazon.com");

        //enter a "wooden spoon" to search
        //locate the search box

        WebElement inputSearch = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));

        inputSearch.sendKeys("wooden spoon");

        WebElement searchButton = driver.findElement(By.xpath("(//input[@class='nav-input'])[1]"));

        searchButton.click();

        String expectedInTitle = "wooden spoon";
        String actualTitle = driver.getTitle();


        if(actualTitle.contains(expectedInTitle)){
            System.out.println("Title verification is Passed!");
        }else{
            System.out.println("Title verification is FAILED!!!");
        }

        //verify the text under search box contains given keyword "wooden spoon"

        WebElement resultContainer = driver.findElement(
                By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[3]"));
        // another locator --> //span[@class='a-color-state a-text-bold']

        String resultContainerText = resultContainer.getText();

        if(resultContainerText.contains(expectedInTitle)){
            System.out.println("Text verification is passed!");
        }else{
            System.out.println("Text verification is failed!!!");
        }
    }
}
