package org.example.Day_19_08_25;

import org.testng.annotations.Test;

public class paralledmethods {
    @Test(priority = 0)
    public static void method1(){
        System.out.println("Method 1 is being called");
    }
    @Test(priority = 1)
    public static void method2(){
        System.out.println("Method 2 is being called");
    }
    @Test(priority = 2)
    public static void method3(){
        System.out.println("Method 3 is being called");
    }
    @Test(priority = 3)
    public static void method4(){
        System.out.println("Method 4 is being called");
    }
    @Test(priority = 4)
    public static void method5(){
        System.out.println("Method 5 is being called");
    }
    @Test(priority = 5)
    public static void method6(){
        System.out.println("Method 6 is being called");
    }
    @Test(priority = 6)
    public static void method7(){
        System.out.println("Method 7 is being called");
    }
    @Test(priority = 7)
    public static void method8(){
        System.out.println("Method 8 is being called");
    }
}

