package com.cybertek;
/*
Practice:	Cybertek	Checkboxes
1.Go	to	http://practice.cybertekschool.com/checkboxes
2.Confirm	checkbox	#1	is	NOT	selected	by	default
3.Confirm	checkbox	#2	is	SELECTED	by	default.
4.Click	checkbox	    #1	to	select	it.
5.Click	checkbox	    #2	to	deselect	it.
6.Confirm	checkbox	#1	is	SELECTED.
7.Confirm	checkbox	#2	is	NOT
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class IsSelectedTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/meerim/Documents/selenium dependancies /drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //locate the webElement
        driver.get("http://practice.cybertekschool.com/checkboxes");


        //Step #1 : locating the webElements to be able to make action on

        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        //--> another way of locating the same webElement --> (//input[@type='checkbox'])[1]
        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        //--> another way of locating the same webElement --> (//input[@type='checkbox'])[2]

        //#1
        if(!checkbox1.isSelected()){
            System.out.println("Checkbox #1 is not Selected. Verification PASSED!");
        }else{
            System.out.println("Checkbox #1 is Selected. Verification FAILED!!!");
        }

        if(checkbox2.isSelected()){
            System.out.println("Checkbox #2 is Selected. Verification PASSED!");
        }else{
            System.out.println("Checkbox #2 is NOT Selected. Verification FAILED!!!");
        }

        checkbox1.click();
        checkbox2.click();

        if(checkbox1.isSelected()){
            System.out.println("Checkbox #1 is Selected. Verification Passed!!");
        }else{
            System.out.println("Checkbox #1 is not Selected. Verification FAILED!");
        }


        if(!checkbox2.isSelected()){
            System.out.println("Checkbox #2 is NOT selected. Verification PASSED!");
        }else{
            System.out.println("Checkbox #2 is Selected. Verification FAILED!!!");
        }

    }
}
