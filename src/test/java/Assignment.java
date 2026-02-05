import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Assignment {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5))

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement searchBox = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
        searchBox.sendKeys("Manish");
        WebElement searchIcon = driver.findElement(By.className("wikipedia-search-button"));
        searchIcon.click();

        //Thread.sleep(5000);
        List<WebElement> allLinks = driver.findElements(By.xpath("//div[contains(@class,'wikipedia-search-results')]//a"));
        System.out.println("Total links found: " + allLinks.size());
        for (WebElement linknames : allLinks) {
            linknames.click();
        }
            Set<String> windowIDs = driver.getWindowHandles();
            for (String winID:windowIDs) {
                String title = driver.switchTo().window(winID).getTitle();
                System.out.println(title);
                if(title.equals("Manish Sisodia - Wikipedia")){
                    driver.close();
                }
            }
        }
    }



