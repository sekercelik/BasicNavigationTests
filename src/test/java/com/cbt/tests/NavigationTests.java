package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {
    chromeTest();
   // FirefoxTest();
   // EdgeTest();


    }

public static void chromeTest(){

   WebDriver driver= BrowserFactory.getDriver("chrome");
    driver.get("https://google.com");
    String str1= driver.getTitle();
    driver.navigate().to("https://etsy.com");
    String str2=driver.getTitle();
    driver.navigate().back();
    StringUtility.verifyEquals(driver.getTitle(),str1);
    driver.navigate().forward();
    StringUtility.verifyEquals(driver.getTitle(),str2);
    driver.quit();

}

//*************************************************************************

    public static void FirefoxTest(){
        WebDriver driver= BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String str1= driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String str2=driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(),str1);
        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(),str2);
        driver.quit();

    }
//*************************************************************************

    public static void EdgeTest(){
        WebDriver driver= BrowserFactory.getDriver("edge");
        driver.get("https://google.com");
        String str1= driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String str2=driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(),str1);
        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(),str2);
        driver.quit();
    }


}
