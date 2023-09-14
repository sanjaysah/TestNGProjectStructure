package com.thetestingacademy.suitec;

import com.aventstack.extentreports.Status;
import com.thetestingacademy.dataprovider.TestDataProvider;
import com.thetestingacademy.testbase.TestBase;
import org.testng.annotations.Test;

public class TestC extends TestBase {
    @Test(groups = {"browsergroup1"},dataProviderClass = TestDataProvider.class,dataProvider = "dataSuiteC")
    public void testC(String browser, String username, String password) throws InterruptedException {
        log("Starting testC");
        log("Username: "+username+" Password: "+password);
        Thread.sleep(2000);
        log("Ending testC");
    }
}
