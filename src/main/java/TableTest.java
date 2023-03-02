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

        List<WebElement> elements = wd.findElements(By.cssSelector("#customers>tbody>tr"));
        System.out.println(elements.size());
        List<WebElement> el = wd.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
        List<WebElement> elements1 = wd.findElements(By.cssSelector("#customers>tbody>tr>th"));
        System.out.println(elements1.size());
        List<WebElement> el1 = wd.findElements(By.xpath("//table[@id='customers']//tbody//tr//th"));
        wd.findElement(By.cssSelector("#customers>tbody>tr:nth-child(3)"));
        WebElement elem = wd.findElement(By.xpath("//table[@id='customers']//tbody//tr[3]"));
        wd.findElement(By.cssSelector("#customers>tbody>tr>th:last-child"));
        WebElement elem1 = wd.findElement(By.xpath("//table[@id='customers']//tbody//tr//th[last()]"));
       // wd.findElement(By.cssSelector("#customers td:nth-child(3),#customers>tbody>tr>th:last-child"));



}
@AfterMethod
    public void postCondition(){
        wd.quit();
}






}
