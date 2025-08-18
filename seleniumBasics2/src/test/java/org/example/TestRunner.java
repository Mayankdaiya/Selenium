package org.example;
import org.testng.TestNG;
import java.util.Collections;

// if test-output folder not creating then run this, it will work definitely

public class TestRunner {
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        testng.setTestSuites(Collections.singletonList("testng.xml")); // relative path to your suite
        testng.run();
    }
}
