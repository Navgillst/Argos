package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager extends Utils
{
    public void openBrowser()
    {//set driver path for Chrome browser
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");

        //opening Chrome browser
        driver = new ChromeDriver();
        //Keeping the browser in full screen mode
        driver.manage().window().maximize();
        //Navigating to demo.nopcommerce.com website with get() method through the object driver
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.argos.co.uk/");
    }

    public void closeBrowser()
    {
        //driver.quit();

    }
}
