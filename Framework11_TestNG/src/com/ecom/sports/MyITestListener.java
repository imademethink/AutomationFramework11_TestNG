package com.ecom.sports;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyITestListener implements ITestListener{

    public void onStart(ITestContext context) {
        System.out.println("When method started - onStart");
    }

    public void onFinish(ITestContext context) {
        System.out.println("When method finished - onFinish Passed Tests are " + context.getPassedTests());
        System.out.println("When method finished - onFinish Failed Tests are " + context.getFailedTests());
    }



    public void onTestStart(ITestResult result) {
        System.out.println("When new Test started - onTestStart " +result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("When new Test success - onTestSuccess " +result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("When new Test fail - onTestFailure " +result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("When new Test skip - onTestSkipped " +result.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}
}
