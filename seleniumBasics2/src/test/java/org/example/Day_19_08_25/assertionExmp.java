package org.example.Day_19_08_25;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class assertionExmp {
    // An assertion is a checkpoint in your test — it checks if something is true or as expected.
    // If the assertion passes, the test continues.
    // If the assertion fails, the test stops and is marked as FAILED.
    // There are two assertion - soft and hard (by default)
    // hard -> execution stops after test fails
    // soft -> execution continues even after fails and report failed one at last
    public static void main(String[] args) {
        String actual = "mayank";
        String expect = "Mayank";

      /*  System.out.println("line before hard assertion");
        Assert.assertEquals(actual, expect);
        System.out.println("line after default or hard assertion");  */

        System.out.println("line before soft assertion");
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(actual, expect);
        System.out.println("line after soft assertion");

        // Collects and reports all failures
        soft.assertAll();
    }
}
