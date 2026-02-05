import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class HandleDropdowns {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement drpDown = driver.findElement(By.id("country"));
        Select options = new Select(drpDown);
        //Select by value
        //options.selectByValue("canada");

        //Select by index
        // options.selectByIndex(4);

        //Select by visible text
        options.selectByVisibleText("Canada");

        //Print all the dropwdown options
        List<WebElement> allDrowDwonOptions = options.getOptions();
        System.out.println("No. of options in the dropdown " + allDrowDwonOptions.size());

        //Print all the dropdown options with name using for loop

      /*  for(int i=0;i<allDrowDwonOptions.size();i++)
            System.out.println(" All options are" + allDrowDwonOptions.get(i).getText());
*/
        //Using enhanced for loop
        for (WebElement option:allDrowDwonOptions) {
            System.out.println(option.getText());

        }
    }

}
