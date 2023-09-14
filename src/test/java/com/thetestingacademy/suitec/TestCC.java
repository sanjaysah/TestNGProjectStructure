package com.thetestingacademy.suitec;

import com.aventstack.extentreports.Status;
import com.thetestingacademy.dataprovider.TestDataProvider;
import com.thetestingacademy.testbase.TestBase;
import org.testng.annotations.Test;

public class TestCC extends TestBase {
    @Test(groups = {"browsergroup2"},dataProviderClass = TestDataProvider.class,dataProvider = "dataSuiteC")
    public void testCC(String browser, String username, String password) throws InterruptedException {
        log("Starting testCC");
        log("Username: "+username+" Password: "+password);
        Thread.sleep(2000);
        log("Ending testCC");
    }
}
