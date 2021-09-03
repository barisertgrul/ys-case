package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginwithWrongiD {
    protected WebDriver driver;
    public WebDriverWait wait;
    boolean result;
    String subWindowHandler = null;
    public LoginwithWrongiD(WebDriver driver){
        this.driver = driver;
    }
    public void logintry(String username, String wrongpassword) {

        driver.findElement(By.id("UserName")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(wrongpassword);
        driver.findElement(By.id("ys-fastlogin-button")).click();
    }
    public void wrongidpopup(){

        driver.findElement(By.xpath("/html/body/div[9]"));
    }
    public void popupclose(){

        driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[2]/button")).click();
    }
}
