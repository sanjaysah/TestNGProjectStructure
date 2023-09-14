package com.thetestingacademy.testbase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.thetestingacademy.Reports.ExtentManager;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;

public class TestBase {

   public ExtentReports reports;
   public ExtentTest test;
   public SoftAssert softAssert;
   public String browser;

    @BeforeMethod(alwaysRun = true)
    public void init(ITestContext context, ITestResult result){
        //browser = context.getCurrentXmlTest().getParameter("browser");
        //System.out.println(browser);
        reports = ExtentManager.getReports();
        test = reports.createTest(result.getMethod().getMethodName());
        result.setAttribute("reporter",test);
        softAssert = new SoftAssert();
        String groupNames[] = context.getAllTestMethods()[0].getGroups();
        String browsergroup="";
        for(String g: groupNames){
            if(g.startsWith("browsergroup")){
                browsergroup=g;
                break;
            }
        }
        browser = context.getCurrentXmlTest().getParameter(browsergroup);
        System.out.println(browser+" - "+result.getMethod().getMethodName());
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        reports.flush();
        softAssert.assertAll();
    }

    public void log(String msg){
        //System.out.println(msg);
        test.log(Status.INFO, msg);
    }

    public void logFAIL(String msg){
        //System.out.println(msg);
        test.log(Status.FAIL, msg);
        // Take screenshot code
    }

    public void failAndStopTest(String msg){
        logFAIL(msg);//extent report
        softAssert.fail(msg);//normal report
        // Take screenshot code
        softAssert.assertAll();// Hard Stop the TC
    }

    public void softFail(String msg){
        logFAIL(msg);//extent report
        softAssert.fail(msg);;//normal report
        // Take screenshot code
    }
}
