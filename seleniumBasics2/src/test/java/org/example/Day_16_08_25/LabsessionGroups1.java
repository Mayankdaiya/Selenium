package org.example.Day_16_08_25;

import org.testng.annotations.Test;

public class LabsessionGroups1 {
    @Test(groups = {"Smoke" })
    public void loinTest() {
        System.out.println("loginTest is executed");

    }
    @Test (groups = {"Regression"})
    public void paymentTest() {
        System.out.println("paymentTest is executed");

    }
    @Test (groups = {"Smoke", "Regression"})
    public void logoutTest() {
        System.out.println("logoutTest is executed");

    }
}
