import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CheckBoxex {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
/*
        //Scenario 1:- Selecting Single CheckBox Only
        WebElement selectedCheckBox = driver.findElement(By.id("tuesday"));
        selectedCheckBox.click();*/

        //Scenario 2:- Selecting All CheckBoxes
       List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        /*for (int i=0;i<checkboxes.size();i++){
            checkboxes.get(i).click();
        }*/

        //Using enhanced for loop
      /*  for (WebElement checkbox:checkboxes) {
            checkbox.click();
        }*/

       // Scenario 3:- Selecting last 3 checkboxes

      /*  for (int i=4;i< checkboxes.size();i++){
            checkboxes.get(i).click();
        }*/

        // Scenario 4:- Selecting first 3 checkboxes
       /* for (int i=0;i<=2;i++){
            checkboxes.get(i).click();
        }*/

        //Scenario 5- Uncheck the selected checkboxes only

        for (int i=0;i<=1;i++){
            checkboxes.get(i).click();
        }
        Thread.sleep(5000);

        for (int i=0;i< checkboxes.size();i++){
           if (checkboxes.get(i).isSelected())
            checkboxes.get(i).click();
        }
    }
}
