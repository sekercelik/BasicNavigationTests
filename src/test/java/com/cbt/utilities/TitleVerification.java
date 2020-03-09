package com.cbt.utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;

public class TitleVerification {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");


       Set<String> titles = new HashSet<>();

        WebDriver driver = BrowserFactory.getDriver("chrome");
        for (String url : urls) {

            driver.get(url);
            titles.add(driver.getTitle());


        }
            if(titles.size()==1){
                System.out.println("Test passed: all titles are same");
            }else {
                System.out.println("test failed: all titles are not same");
            }



            for(String url : urls){
                if(url.startsWith("http://practice.cybertekschool.com")){
                    System.out.println("passed==> "+ url + " starts with \"http://practice.cybertekschool.com\"");
                }else{
                    System.out.println("failed ");
                }
            }


            driver.quit();


        }
    }

