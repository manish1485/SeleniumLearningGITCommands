import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class HiddenDropDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();//PIM

        //Clicking on dropdown

        driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
        Thread.sleep(3000);

        //driver.findElement(By.xpath("//span[normalize-space()='Automaton Tester']")).click();

        List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));

        System.out.println(options.size());

        for (WebElement op:options) {
            System.out.println("Dropdown  options are " +op.getText());

        }

    }
    }

