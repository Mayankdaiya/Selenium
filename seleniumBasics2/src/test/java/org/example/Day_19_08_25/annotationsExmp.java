package org.example.Day_19_08_25;

import org.testng.annotations.*;

public class annotationsExmp {
    // SLTC  -> suite > test > class > method
    /*
    * @BeforeSuite: Runs before any tests or classes are executed.
    * @BeforeTest: Runs before any tests in a <test> tag start running.
    * @BeforeClass: Runs before any test methods in the current class are executed.
    * @BeforeMethod: Runs before each test method is executed.
    * Test Method (@Test): The actual test method. This is where the main logic and assertions are placed.
    * @AfterMethod: Runs after each test method has been executed.
    * @AfterClass: Runs after all the test methods in the current class have been executed.
    * @AfterTest: Runs after all tests in the <test> tag have been executed.
    * @AfterSuite: Runs after all tests in the suite are completed.
    * */

    @BeforeTest
    public static void beforeTest(){
        System.out.println("BeforeTest is being called");
    }
    @AfterTest
    public static void afterTest(){
        System.out.println("AfterTest is being called");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("BeforeClass is being called");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("AfterClass is being called");
    }
    @BeforeSuite
    public static void beforeSuite(){
        System.out.println("BeforeSuite is being called");
    }
    @AfterSuite
    public static void afterSuite(){
        System.out.println("AfterSuite is being called");
    }
    @BeforeMethod
    public static void beforeMethod(){
        System.out.println("BeforeMethod is being called");
    }
    @AfterMethod
    public static void afterMethod(){
        System.out.println("AfterMethod is being called");
    }
    @Test
    public static void test1(){
        System.out.println("Test1 is being called");
    }
    @Test
    public static void test2(){
        System.out.println("Test2 is being called");
    }
}
