import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/meerim/Documents/selenium dependencies /drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        String actualTitle = driver.getTitle();

        String expectedTitle = "Google";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Google Title Verification PASSED!");
        }else{
            System.out.println("Google Title Verification FAILED");
        }
    }
}
