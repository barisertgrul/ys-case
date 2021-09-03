package pageObject;
import library.CaptureScreenshot;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class LoginPage {
    protected WebDriver driver;
    public WebDriverWait wait;
    boolean result;
    String subWindowHandler = null;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void navigateTo(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }
    public void validate_city_select_page(){
        Assert.assertEquals("Yemek Sepeti - Online Yemek Siparişi ve Paket Servis", driver.getTitle());
    }

    public void selectcity() {
        //select city
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/a[34]/div/span")).click();
    }

    public void validatehomepage(){
        Assert.assertEquals("İstanbul Online Yemek Siparişi, Paket Servis - Yemek Sepeti", driver.getTitle());
    }

    public void logInTheForm(String username, String password) {

        driver.findElement(By.id("UserName")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("ys-fastlogin-button")).click();
    }
}
