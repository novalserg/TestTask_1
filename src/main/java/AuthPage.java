import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class AuthPage extends AbstractPage {
    @Override
    String getName() {
        return "AuthPage";
    }

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("URL page");

        WebElement InputField = driver.findElement(By.id("locator"));
        InputField.sendKeys("login/password");

        WebElement SubmitButton = driver.findElement(By.xpath("locator"));
        SubmitButton.click();

    }




}
