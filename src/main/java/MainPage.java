import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage extends AbstractPage{

    @Override
    String getName() {
        return "MainPage>";
    }

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("URL page");

        WebElement TextField = driver.findElement(By.id("locator"));
        TextField.sendKeys("89054893467");

        WebElement SubmitButton = driver.findElement(By.xpath("locator"));
        SubmitButton.click();

    }
}
