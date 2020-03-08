package com.cbt.utilities;
import org.openqa.selenium.WebDriver;

import java.util.*;


public class TitleVerification2 {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://www.wayfair.com/",
                "https://walmart.com",
                "https://www.westelm.com/");
        WebDriver driver = BrowserFactory.getDriver("chrome");

        for (String each : urls) {
            driver.get(each);
            String title=driver.getTitle().replace(" ","").toLowerCase();

            if (each.contains(title)) {
                System.out.print(each+ " contains "+ title+ " ==> pass" );
            } else {
                System.out.println(each+ " doesn't contain "+ title+ " ==> fail");

            }
            System.out.println();
        }

        driver.quit();

    }
}
