package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFail {
    protected WebDriver driver;
    public WebDriverWait wait;
    boolean result;
    String subWindowHandler = null;
    public LoginFail(WebDriver driver){
        this.driver = driver;
    }
    public void faillogin() {

        String email = "baristestmail@gmail.com";
        String pw = "123456Be.";

        Assert.assertEquals("İstanbul Online Yemek Siparişi, Paket Servis - Yemek Sepeti", driver.getTitle());
        driver.findElement(By.id("UserName")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(pw);
        driver.findElement(By.id("ys-fastlogin-button")).click();
        //checking for wrong id
        driver.findElement(By.id("user"));
    }
}
