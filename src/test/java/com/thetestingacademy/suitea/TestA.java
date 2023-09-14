package com.thetestingacademy.suitea;

import com.aventstack.extentreports.Status;
import com.thetestingacademy.dataprovider.TestDataProvider;
import com.thetestingacademy.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestA extends TestBase {
    @Test(groups = {"browsergroup1"},dataProviderClass = TestDataProvider.class,dataProvider = "dataSuiteA")
    public void testA(String browser, String username, String password) throws InterruptedException {
        log("Starting testA");
        //Handling fail msgs coming at last due to softassert ALL at last in extent report
        if(!"Title1".equals("Title")){
            softFail("Titles do not Match");
        }
        log("In between1");
        //Handling fail msgs coming at last due to softassert ALL at last in extent report
        if(!"Name1".equals("Name2")){
            softFail("Names do not Match");
        }
        log("In between2");
        log("Browser: "+browser+" Username: "+username+" Password: "+password);
        Thread.sleep(2000);
        //softAssert.fail("Failed Test Case testA");
        //Assert.fail("Failed Test Case testA");
        //logFAIL(" test failed");
        log("Ending testA");
    }
}
