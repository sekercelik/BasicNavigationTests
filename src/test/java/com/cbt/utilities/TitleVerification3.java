package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {


        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com",
                "https://www.westelm.com/");


        for (String each: urls ) {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get(each);

            String title=driver.getTitle().replace(" ", "").toLowerCase();
            if(each.contains(title)){
                System.out.println(each+ " contains "+ title+ " ==> pass");
            } else {
                System.out.println( each+ " doesn't contain "+ title+ " ==> fail");
            }
            driver.close();

        }
    }
}