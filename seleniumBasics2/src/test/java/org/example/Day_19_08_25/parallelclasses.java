package org.example.Day_19_08_25;

import org.testng.annotations.Test;

public class parallelclasses {
    @Test(priority = 0)
    public static void class1(){
        System.out.println("Class 1 is being called");
    }
    @Test(priority = 1)
    public static void class2(){
        System.out.println("Class 2 is being called");
    }
    @Test(priority = 2)
    public static void class3(){
        System.out.println("Class 3 is being called");
    }
    @Test(priority = 3)
    public static void class4(){
        System.out.println("Class 4 is being called");
    }
    @Test(priority = 4)
    public static void class5(){
        System.out.println("Class 5 is being called");
    }
    @Test(priority = 5)
    public static void class6(){
        System.out.println("Class 6 is being called");
    }
    @Test(priority = 6)
    public static void class7(){
        System.out.println("Class 7 is being called");
    }
    @Test(priority = 7)
    public static void class8(){
        System.out.println("Class 8 is being called");
    }
}
