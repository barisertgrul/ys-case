package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Search {
    protected WebDriver driver;
    public WebDriverWait wait;
    boolean result;
    String subWindowHandler = null;
    public Search(WebDriver driver){
        this.driver = driver;
    }
    public void validatehomepage(){
        Assert.assertEquals("İstanbul Online Yemek Siparişi, Paket Servis - Yemek Sepeti", driver.getTitle());
    }
    public void regiondropdown(){

        driver.findElement(By.id("select2-ys-areaSelector-container")).click();
    }

    public void regiontype(){
        String region = "zuhuratbaba";
        driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/span/span/span[1]/input")).sendKeys(region);
    }

    public void selectregion(){
        // select region
        driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/span/span/span[2]/ul/li/ul/li[2]")).click();
    }

    public void search(){
        String search = "burger";
        //search
        driver.findElement(By.xpath("/html/body/header/div/div/div/div[3]/input")).sendKeys(search);
    }

    public void searchbutton(){

        driver.findElement(By.xpath("/html/body/header/div/div/div/div[5]/button")).click();
    }

    public void searchresults() {
        Assert.assertEquals("Yemek ve Restoran Ara - Yemek Sepeti", driver.getTitle());
    }

    public void selectfromsearchresults() throws InterruptedException {
        //select first restaurant from the list
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/a")).click();
    }
}
