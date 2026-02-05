import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.html.HTMLImageElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class seleniumCommands {

    public static void main(String[] args) throws InterruptedException {

            WebDriver driver=new ChromeDriver(); {

                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


             driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
             driver.manage().window().maximize();

            driver.findElement(By.linkText("OrangeHRM, Inc")).click();

           // System.out.println(driver.getCurrentUrl());

            //Approach 1
           /* Set<String> windowIDs = driver.getWindowHandles();
            List<String> windowList=new ArrayList<>(windowIDs);
            String parentId = windowList.get(0);
            String childID = windowList.get(1);
            driver.switchTo().window(childID);
            System.out.println(driver.getCurrentUrl());
            driver.switchTo().window(parentId);
            System.out.println(driver.getCurrentUrl());*/
            
            //Approach 2
        Set<String> windowIDs = driver.getWindowHandles();
        for (String  winid: windowIDs){
            String title = driver.switchTo().window(winid).getTitle();
          //  System.out.println(title);

            if (title.equals("OrangeHRM")){
                System.out.println("working fine");
            }
            else{
                System.out.println("Not working fine");
            }


        }


            //  driver.get("https://demo.nopcommerce.com/register");
         //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

           // WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        /*    WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated((By.name("username"))));
            username.sendKeys("Manish");

          //  WebDriverWait myWait=new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
            password.sendKeys("Sharma");

            WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));
            login.click();*/




           /* boolean displayed = driver.findElement(By.id("gender-male")).isDisplayed();
            displayed.c
            System.out.println("Status of radio buttin is " + displayed);
            */



           /* Thread.sleep(5000);
            driver.findElement(By.linkText("OrangeHRM, Inc")).click();
            String windowHandle = driver.getWindowHandle();
            System.out.println("Window ID is " +windowHandle);
            Set<String> windowHandles = driver.getWindowHandles();
            System.out.println("Windows ID's are these " +windowHandles);

            driver.close();*/

        }
    }
}
