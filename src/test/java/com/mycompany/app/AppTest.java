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

        driver.get("https://github.com/bonigarcia/webdrivermanager");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        WebElement el = driver.findElement(By.xpath("//*[@class='f4 my-3']"));
        
        System.out.println(el.getText());

        assertEquals(el.getText(), "asdasdasd");
    }


    @After
    public static void closeBrowser(){
        driver.close();
    }
}
