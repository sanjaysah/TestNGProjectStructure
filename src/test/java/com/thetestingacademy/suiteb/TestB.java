package com.thetestingacademy.suiteb;

import com.aventstack.extentreports.Status;
import com.thetestingacademy.dataprovider.TestDataProvider;
import com.thetestingacademy.testbase.TestBase;
import org.testng.annotations.Test;

public class TestB extends TestBase {
    @Test(groups = {"browsergroup1"},dataProviderClass = TestDataProvider.class,dataProvider = "dataSuiteB")
    public void testB(String browser, String username, String password) throws InterruptedException {
        log("Starting testB");
        log("Username: "+username+" Password: "+password);
        Thread.sleep(2000);
        log("Ending testB");
    }
}
