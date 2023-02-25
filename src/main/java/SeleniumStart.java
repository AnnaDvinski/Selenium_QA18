import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static com.sun.jmx.snmp.EnumRowStatus.active;

public class SeleniumStart {

    WebDriver wd;
    @BeforeMethod
    public void preCondition(){
        System.out.println("Opening web-site");
        wd = new ChromeDriver();
        wd.navigate().to("https://telranedu.web.app/login");
    }
    @Test
    public void testLogin(){
       // WebElement element = wd.findElement(By.tagName("a"));
       //List<WebElement> elements = wd.findElements(By.tagName("a"));
       // System.out.println(elements.size());
        WebElement element = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        System.out.println(element);
        WebElement e = By.cssSelector(".navbar-component_nav__1X_4m").findElement(wd);
        WebElement element1 = wd.findElement(By.className("active"));
        System.out.println(element1);
        WebElement el = wd.findElement(By.cssSelector("[class='active']"));
        WebElement element2 = wd.findElement(By.id("root"));
        System.out.println(element2);
        WebElement el2 = wd.findElement(By.cssSelector("#root"));
        WebElement el3 = wd.findElement(By.cssSelector("[id='root']"));
        WebElement element3 = wd.findElement(By.linkText("ABOUT"));
        System.out.println(element3);
        WebElement element4 = wd.findElement(By.linkText("LOGIN"));
        System.out.println(element4);
        WebElement element5 = wd.findElement(By.partialLinkText("AB"));
        System.out.println(element5);
      //WebElement el4 = wd.findElement(By.cssSelector("[href^='AB']"));
        WebElement element6 = wd.findElement(By.linkText("LOGIN"));
        System.out.println(element6);
    }
    @AfterMethod
    public void postCondition(){
        wd.quit();
    }

}
