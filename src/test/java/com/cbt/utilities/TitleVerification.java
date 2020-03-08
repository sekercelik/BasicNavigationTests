package com.cbt.utilities;
import org.openqa.selenium.WebDriver;

import java.util.*;

public class TitleVerification {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");


        Set<String> title= new HashSet<>();

        WebDriver driver= BrowserFactory.getDriver("chrome");
        for (int i = 0; i < urls.size(); i++) {
            driver.get(urls.get(i));
            title.add(driver.getTitle());
            System.out.println("title: " + title);
        }
            for(String url : urls){
                if(driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com")){
                    System.out.println("passed==> "+ driver.getCurrentUrl() + " starts with \"http://practice.cybertekschool.com\"");
                }else{
                    System.out.println("failed ");
                }
            }


        driver.quit();


        }
        }

