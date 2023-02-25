import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest {
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
        System.out.println("Opening web-site");
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }
    @Test
public void tableHW2(){
        List<WebElement> elements = By.cssSelector("#customers>tbody>tr").findElements(wd);
        System.out.println(elements.size());
        List<WebElement> elements1 = By.cssSelector("#customers>tbody>tr>th").findElements(wd);
        System.out.println(elements1.size());
        By.cssSelector("#customers>tbody>tr:nth-child(3)").findElement(wd);
        //By.cssSelector("#customers td:nth-child(3),#customers>tbody>tr>th:last-child").findElement(wd);
        By.cssSelector("#customers>tbody>tr>th:last-child").findElement(wd);

}
@AfterMethod
    public void postCondition(){
        wd.quit();
}






}
