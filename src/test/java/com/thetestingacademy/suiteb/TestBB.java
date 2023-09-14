package com.thetestingacademy.suiteb;

import com.aventstack.extentreports.Status;
import com.thetestingacademy.dataprovider.TestDataProvider;
import com.thetestingacademy.testbase.TestBase;
import org.testng.annotations.Test;

public class TestBB extends TestBase {
    @Test(groups = {"browsergroup2"},dataProviderClass = TestDataProvider.class,dataProvider = "dataSuiteB")
    public void testBB(String browser, String username, String password) throws InterruptedException {
        log("Starting testBB");
        log("Username: "+username+" Password: "+password);
        Thread.sleep(2000);
        log("Ending testBB");
    }
}
