package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSuit extends BaseTest
{

    String expectedShopM = "Shop";
    String expectedChristmasM = "Christmas";


@Test
    public void homepage()
{


    driver.findElement(By.id("consent_prompt_submit")).click();
   String actualShopM = driver.findElement(By.xpath("//span[@class='_13iYl'][normalize-space()='Shop']")).getText();
    Assert.assertEquals(actualShopM,expectedShopM);

    WebElement ele = driver.findElement(By.xpath("//span[@class='_13iYl'][normalize-space()='Shop']"));
    //Creating object of an Actions class
    Actions action = new Actions(driver);
    //Performing the mouse hover action on the target element.
    action.moveToElement(ele).perform();


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"N6CVe\"]//a[contains(@aria-label, \"Christmas \")]")));

    String actualChristmasM = driver.findElement(By.xpath("//div[@class=\"N6CVe\"]//a[contains(@aria-label, \"Christmas \")]")).getText();
    Assert.assertEquals(actualChristmasM,expectedChristmasM);

    ele = driver.findElement(By.xpath("//div[@class=\"N6CVe\"]//a[contains(@aria-label, \"Christmas \")]"));


    //Performing the mouse hover action on the target element.
    action.moveToElement(ele).perform();







}


}
