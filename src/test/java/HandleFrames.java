import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleFrames {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://ui.vision/demo/webtest/frames");
        // driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        //Frame1
        WebElement frameElement1 = driver.findElement(By.cssSelector("frame[src='frame_1.html']"));
        driver.switchTo().frame(frameElement1);
        driver.findElement(By.name("mytext1")).sendKeys("Manish");

        driver.switchTo().defaultContent(); //Go Back to page

        //Frame 2
        WebElement frameElement2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frameElement2);
        driver.findElement(By.name("mytext2")).sendKeys("Learning Selenium");
        driver.switchTo().defaultContent();

        //Frame 3

        WebElement frameElement3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frameElement3);
        driver.findElement(By.name("mytext3")).sendKeys("And Java");
        driver.switchTo().frame(0); // Switching to frame using index
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();

        driver.findElement(By.xpath("//div[@id='i21']//div[@class='uHMk6b fsHoPb']")).click();


    }

}