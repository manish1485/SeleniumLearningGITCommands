import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class ddpractice {

    public static void main(String[] args) throws InterruptedException {
        //Manish code added today 5th Feb in the eve
        // develop branch changes
        //Another person changes hh

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       // driver.get("https://testautomationpractice.blogspot.com/");
        driver.get("https://www.flipkart.com/");
        // driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Selenium");



       // List<WebElement> elements = driver.findElements(By.xpath("(//div[@class='YGcVZO _2VHNef'])"));

        List<WebElement> elements = driver.findElements(By.xpath("//ul[contains(@class,'_1sFryS _2x2Mmc _3ofZy1')]"));

      //  _1sFryS _2x2Mmc _3ofZy1
        for (WebElement ele:elements) {
            System.out.println(ele.getText());

        }
      /*  WebElement dd = driver.findElement(By.xpath("//select[@id='colors']"));
        Select dropdown = new Select(dd);
       // dropdown.selectByVisibleText("Green");

        List<WebElement> elements = driver.findElements(By.xpath("//select[@id='colors']"));
        for (WebElement allValues:elements) {
            String text = allValues.getText();
            if (text.equals("Green") || text.equals("Yellow") || text.equals("White")){
                allValues.click();
            }*/
        }
    }


