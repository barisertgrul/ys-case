package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ClearFavList {
    protected WebDriver driver;
    public WebDriverWait wait;
    boolean result;
    String subWindowHandler = null;
    public ClearFavList(WebDriver driver){
        this.driver = driver;
    }
    public void gotofavlist() {
        WebDriverWait wait = new WebDriverWait(driver, 5L);
        driver.findElement(By.className("ys-pullRight")).click();
        WebDriverWait wait2 = new WebDriverWait(driver, 2L);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div[2]/div[1]/ul/li[4]/a")).click();
        Assert.assertEquals("Favorilerim - Yemek Sepeti", driver.getTitle());
    }

    public void selectrestaurants() {
        //select all the restauraunts on the list
        try {
            List<WebElement> AllCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

            int size = AllCheckboxes.size();

            for (WebElement allCheckbox : AllCheckboxes) {

                allCheckbox.click();

            }
        } catch (Exception e) {
            System.out.println("favorites is empty");
        }
    }
    public void clearlist(){
        //click on delete button
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[3]/form/div[2]/button")).click();

    }
    public void emptylist(){
        try{

            driver.findElement(By.xpath("//div[@class='no-favorite notAvailable']"));
            System.out.println("delete button did work");

        } catch (Exception f) {
            driver.navigate().refresh();
            System.out.println("delete button doesnt refresh page:)");

        }
        driver.quit();
    }
}

