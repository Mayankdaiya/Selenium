package org.example.Day_19_08_25;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class customTestListeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult arg0) {
        System.out.println("The testcase execution is started using Custom logs");
        System.out.println(arg0);
    }

    @Override
    public void onTestSkipped(ITestResult arg0) {
        System.out.println("The testcase execution is skipped  using Custom logs");
    }

    @Override
    public void onTestSuccess(ITestResult arg0) {
        System.out.println("The testcase execution is completed successfully using Custom logs");
        System.out.println(arg0);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        System.out.println("The testcase execution is completed with few issues using Custom logs");
    }

    @Override
    public void onTestFailure(ITestResult arg0) {
        System.out.println("The testcase execution is failed using Custom logs");
    }

    @Override
    public void onFinish(ITestContext arg0) {
        System.out.println("The testcase execution is completed using Custom logs");
        System.out.println(arg0);
    }

}
