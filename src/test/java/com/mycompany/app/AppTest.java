package com.mycompany.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;


@RunWith(JUnit4.class)
public class AppTest {
    public AppTest() {
    }
    public static WebDriver driver;
    @BeforeClass
    public static void vef(){
        WebDriverManager.chromedriver().setup();
        
        driver = new ChromeDriver();
    }

    
    @Test
    public void testApp() throws Exception {
        

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
        driver.close();

        assertTrue(true);
    }

    @AfterClass
    public static void asd(){
        driver.close();
    }

    // @After
    // private void After(){
    //     if (driver != null){
    //         driver.close();
    //     }
    // }
}
