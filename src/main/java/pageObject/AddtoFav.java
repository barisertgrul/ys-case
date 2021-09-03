package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtoFav {
    protected WebDriver driver;
    public WebDriverWait wait;
    boolean result;
    String subWindowHandler = null;
    public AddtoFav(WebDriver driver){
        this.driver = driver;
    }
    public void landingtorestaurant(){
        //checking if there is a fav button to see landing in restaurant
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div"));
        //check to see if restaurant is working
        try{
            driver.findElements(By.id("alternative-restaurant-popup"));
            driver.findElement(By.className("close-alternative-popup")).click();
            //restaurant may not be working
            System.out.println("restaurant is closed popup present");


        } catch (Exception e) {
            System.out.println("restaurant is closed popup not present");

        }
    }
    public void addingfav() {
        //click on fav button
        driver.findElement(By.xpath("//div[@class='social-button favorite-button add active']")).click();
    }
    public void faviconyellow(){
        driver.findElement(By.xpath("//div[@class='social-button favorite-button delete active']"));
    }
}
