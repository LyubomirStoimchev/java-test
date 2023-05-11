package com.mycompany.app;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;


public class AppTest {
    public AppTest() {
    }
    public static WebDriver driver;
    
    @Before
    public static void initializeBrowser(){
        WebDriverManager.chromedriver().browserInDocker().setup();

        ChromeOptions opts = new ChromeOptions();
        opts.addArguments("--headless", "--disable-dev-shm-usage", "--no-sandbox");

        driver = new ChromeDriver(opts);
    }

    
    @Test
    public void simpleTest() throws Exception {
    }


    @After
    public static void closeBrowser(){
        driver.close();
    }
}
