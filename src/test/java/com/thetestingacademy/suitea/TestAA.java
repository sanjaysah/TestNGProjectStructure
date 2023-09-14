package com.thetestingacademy.suitea;

import com.aventstack.extentreports.Status;
import com.thetestingacademy.dataprovider.TestDataProvider;
import com.thetestingacademy.testbase.TestBase;
import org.testng.annotations.Test;

public class TestAA extends TestBase {
    @Test(groups = {"browsergroup2"},dataProviderClass = TestDataProvider.class,dataProvider = "dataSuiteA")
    public void testAA(String browser, String username, String password) throws InterruptedException {
        log("Starting testAA");
        log("Username: "+username+" Password: "+password);
        Thread.sleep(2000);
        log("Ending testAA");
    }
}
