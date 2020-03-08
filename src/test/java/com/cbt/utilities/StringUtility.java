package com.cbt.utilities;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class StringUtility {

public static void verifyEquals(String actual, String expected){
    if(actual.equals(expected)){
        System.out.println("PASS");
    }else{
        System.out.println("FAIL");
        System.out.println("actual: "+ actual + ", expected: "+ expected);
    }
}
// Ternary:
    //System.out.println(actual.equals(expected)? "PASS" : "FAIL");

}
