import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleAlerts {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
       // driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.manage().window().maximize();
       // driver.findElement(By.cssSelector("tr > td > input")).click();
        driver.findElement(By.xpath("//tr[4]/td[4]/input")).click();

        //Normal Alert with OK button
        /*driver.findElement(By.id("alertBtn")).click();
         Alert myAlert=driver.switchTo().alert();

        System.out.println(myAlert.getText());
        myAlert.accept();*/

        //Scenario 2 -  Confirmation Alert (Ok and Cancel Button)
       /* driver.findElement(By.id("confirmBtn")).click();
        Alert myAlert=driver.switchTo().alert();
        Thread.sleep(3000);
        myAlert.accept();
*/
        //Scenario 3 -  Prompt Alert (Where you enter something in the alert box)
      /*  driver.findElement(By.id("promptBtn")).click();
        Alert myAlert = driver.switchTo().alert();
        Thread.sleep(3000);
        myAlert.sendKeys("Welcome to the course");
        myAlert.accept();

        WebElement demo = driver.findElement(By.id("demo"));
        System.out.println(demo.getText());
        if (demo.getText().equals("Hello Welcome to the course! How are you today?")) {
            System.out.println("Correct");
        } else {
            System.out.println("Pls enter something");
        }*/

        //  Scenario 4-  Handling Alert without using switch()
      /*  driver.findElement(By.id("promptBtn")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));

        Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(2000);
        System.out.println(myAlert.getText());
        myAlert.accept();*/

        //Scenario 5-  Authentication Popup (Injection Process)
       // driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

    }

}


