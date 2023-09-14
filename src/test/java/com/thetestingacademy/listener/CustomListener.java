package com.thetestingacademy.listener;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentTest test = (ExtentTest) result.getAttribute("reporter");
        test.log(Status.FAIL,result.getThrowable().getMessage());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentTest test = (ExtentTest) result.getAttribute("reporter");
        test.log(Status.PASS,result.getName()+" PASSED");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentTest test = (ExtentTest) result.getAttribute("reporter");
        test.log(Status.SKIP,result.getName()+" SKIPPED");
    }
}
