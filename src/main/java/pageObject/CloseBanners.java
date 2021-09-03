package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class CloseBanners {
    protected WebDriver driver;
    public WebDriverWait wait;
    boolean result;
    String subWindowHandler = null;
    public CloseBanners(WebDriver driver){
        this.driver = driver;
    }
    public void banners(){
        // banabi popup
        driver.findElement(By.xpath("/html/body/div[11]/div/div/div"));
        //banabi delvery info popup
        driver.manage().timeouts().implicitlyWait(8L, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='banabi-delivery-info available']"));
        // banabi delivery popup close
        driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@class='banabi-delivery-info-close-button']")).click();
        //banabi popup close
        driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@class='modal-header-close']")).click();
        driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
    }
}
