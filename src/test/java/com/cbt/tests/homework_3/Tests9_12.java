package com.cbt.tests.homework_3;

import com.cbt.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Tests9_12 {

    private WebDriver driver;
    private String URL = "https://practice-cybertekschool.herokuapp.com/";

    //****************************************************************************************************************
    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Status Codes")).click();
    }


    //****************************************************************************************************************
    @Test
    public void testCase9() {
        driver.findElement(By.linkText("200")).click();
        String expected= "This page returned a 200 status code.";
        String actual= driver.findElement(By.tagName("p")).getText();
        assertTrue(actual.contains(expected));
       BrowserUtils.wait(3);

        //  a different approach
        //  WebElement message = driver.findElement(By.xpath("//p[contains(text(),'This page returned a 200 status code.')]"));
        //  WebElement message = driver.findElement(By.tagName("p"));
        //  assertTrue(message.isDisplayed());
        //  BrowserUtils.wait(5);

    }

    //*****************************************************************************************************************
    @Test
    public void testCase10() {
        driver.findElement(By.linkText("301")).click();
        WebElement message = driver.findElement(By.tagName("p"));
        assertTrue(message.isDisplayed());
    }

    //****************************************************************************************************************
    @Test
    public void testCase11() {
        driver.findElement(By.linkText("404")).click();
        WebElement message = driver.findElement(By.tagName("p"));
        assertTrue(message.isDisplayed());
    }


    //****************************************************************************************************************
    @Test
    public void testCase12() {
        driver.findElement(By.linkText("500")).click();
        WebElement message = driver.findElement(By.tagName("p"));
        assertTrue(message.isDisplayed());
    }

    //********************************************************************************************************************

    @AfterMethod
    public void teardown() {
        if (driver != null) {  // if web driver object alive
            driver.quit();    // close browser, close session
            driver = null;    // destroy webdriver object for sure
        }

    }
}
